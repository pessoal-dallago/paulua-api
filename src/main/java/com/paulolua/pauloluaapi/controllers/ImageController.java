package com.paulolua.pauloluaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paulolua.pauloluaapi.models.Image;
import com.paulolua.pauloluaapi.repositories.ImageRepository;

@RestController
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @GetMapping("/image")
    public List<Image> getImage(){
        List<Image> images = imageRepository.findAll();
        return images;
    }

    @PostMapping("/image")
    public Image postImage(@RequestBody Image image){
        Image savedImage = imageRepository.save(image);
        return savedImage;
    }
}