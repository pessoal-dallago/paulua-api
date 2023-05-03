package com.paulolua.pauloluaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paulolua.pauloluaapi.models.Image;
import com.paulolua.pauloluaapi.services.ImageService;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/image")
    public List<Image> getImage(){
        return imageService.getImage();
    }

    @PostMapping("/image")
    public Image postImage(@RequestBody Image image){
        return imageService.postImage(image);
    }

    @DeleteMapping("/image/delete/{serial}")
    public void deleteImage(@PathVariable Integer serial) {
    	imageService.deleteImage(serial);
    }

    @PutMapping("/image/update/{serial}")
    public ResponseEntity<Object> updateImage(@PathVariable Integer serial, @RequestBody Image image) {
        return imageService.updateImage(serial, image);
    }
}