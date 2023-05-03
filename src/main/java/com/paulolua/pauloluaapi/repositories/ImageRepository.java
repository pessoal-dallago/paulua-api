package com.paulolua.pauloluaapi.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paulolua.pauloluaapi.models.Image;

public interface ImageRepository extends MongoRepository<Image, Integer>{
    long deleteBySerial(Integer serial);
    Optional<Image> findBySerial(Integer serial);
}