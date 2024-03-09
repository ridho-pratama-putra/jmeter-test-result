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
}
