package com.btpn.vcs.msliveness.model;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Generated;

public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
}
