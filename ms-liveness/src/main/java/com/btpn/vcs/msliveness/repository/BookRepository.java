package com.btpn.vcs.msliveness.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.btpn.vcs.msliveness.model.Book;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
    
}
