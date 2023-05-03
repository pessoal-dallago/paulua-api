package com.paulolua.pauloluaapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.paulolua.pauloluaapi.models.Image;
import com.paulolua.pauloluaapi.repositories.ImageRepository;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public List<Image> getImage(){
        List<Image> images = imageRepository.findAll();
        return images;
    }

    public Image postImage(@RequestBody Image image){
        Image savedImage = imageRepository.save(image);
        return savedImage;
    }

    public ResponseEntity<Object> deleteImage(Integer serial) {
    	// Optional<Image> image = imageRepository.findById(serial);
    	imageRepository.deleteBySerial(serial);
        return ResponseEntity.status(HttpStatus.OK).body(serial);
    }

    public ResponseEntity<Object> updateImage(Integer serial, Image image) {
        Optional<Image> imageOptional = imageRepository.findBySerial(serial);

        Image existingImages = imageOptional.get();
        existingImages.setUrl(image.getUrl());
        existingImages.setLabel(image.getLabel());
        existingImages.setSerial(image.getSerial());
        
        Image updateImages = imageRepository.save(existingImages);
        return ResponseEntity.status(HttpStatus.OK).body(updateImages);
    }
}