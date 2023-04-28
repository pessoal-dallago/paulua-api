package com.paulolua.pauloluaapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paulolua.pauloluaapi.models.Image;

public interface ImageRepository extends MongoRepository<Image, String>{
    
}