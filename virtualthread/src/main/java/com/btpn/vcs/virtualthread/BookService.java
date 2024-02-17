package com.btpn.vcs.virtualthread;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    
    public List<BookModel> getData() {
        List<BookModel> all = bookRepository.findAll();
        return all;
    }
}
