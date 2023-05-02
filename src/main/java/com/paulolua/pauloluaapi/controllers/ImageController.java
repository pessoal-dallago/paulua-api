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
    private ImageService ImageService;

    @GetMapping("/image")
    public List<Image> getImage(){
        return images;
    }

    @PostMapping("/image")
    public Image postImage(@RequestBody Image image){
        return savedImage;
    }

    @DeleteMapping("/image/delete/{serial}")
    public void deleteImage(@PathVariable Integer serial) {
    	ImageService.deleteImage(serial);
    }

    @PutMapping("/image/update/{serial}")
    public ResponseEntity<Object> updateImage(@PathVariable Integer serial, @RequestBody Image image) {
        return imageService.updateImage(serial, image);
    }
}