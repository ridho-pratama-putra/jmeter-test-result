package com.btpn.vcs.mslivenessnonreactive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    ResponseEntity<List<BookModel>> get() {
        // List<BookModel> asList = Arrays.asList(BookModel.builder().title("akang").build(), BookModel.builder().title("gendang").build());
        List<BookModel> asList = bookService.getData();
        return ResponseEntity.ok().body(asList);
    }
}
