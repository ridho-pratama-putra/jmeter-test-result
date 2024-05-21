package com.btpn.vcs.msliveness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.btpn.vcs.msliveness.model.Book;
import com.btpn.vcs.msliveness.repository.BookRepository;

import reactor.core.publisher.Mono;

@Service
public class BookService {

    @Autowired 
    BookRepository repository;

    public Mono<ResponseEntity<List<Book>>> getData() {
        Mono<ResponseEntity<List<Book>>> flatMap = repository.findAll().collectList().flatMap(res -> {
            return Mono.just(ResponseEntity.ok().body(res));
        });
        return flatMap;
    }

    public Mono<Book> checkout() throws Exception {
        Mono<Book> byId = repository.findById(1L);

        return byId.flatMap(book -> {
            if (book.getStock() == 0) {
                return Mono.error(new Exception());
            }

            book.setStock(book.getStock() - 1);
            return repository.save(book);
        });
    }
}
