package com.btpn.vcs.virtualthread;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadController {

    @Autowired
    BookService bookService;
    
    @GetMapping("/")
    public ResponseEntity<List<BookModel>> getThreadName() {
        return ResponseEntity.ok().body(bookService.getData());
    }
}