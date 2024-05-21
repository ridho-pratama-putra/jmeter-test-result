package com.btpn.vcs.mslivenessnonreactive;

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

    public void checkout() throws Exception {
        BookModel byId = bookRepository.findById(1L).get();
        if (byId.getStock() == 0) {
            throw new Exception();
        }
        byId.setStock(byId.getStock() - 1);
        bookRepository.save(byId);
    }
}
