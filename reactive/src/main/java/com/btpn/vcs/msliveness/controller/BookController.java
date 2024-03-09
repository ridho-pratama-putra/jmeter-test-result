package com.btpn.vcs.msliveness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btpn.vcs.msliveness.model.Book;
import com.btpn.vcs.msliveness.service.BookService;

import reactor.core.publisher.Mono;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    Mono<ResponseEntity<List<Book>>> get() {
        return bookService.getData();
    }
}
