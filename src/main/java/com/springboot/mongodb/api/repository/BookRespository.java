package com.springboot.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongodb.api.model.Book;

public interface BookRespository extends MongoRepository<Book,Integer>{

}
