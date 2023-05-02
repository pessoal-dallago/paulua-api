package com.paulolua.pauloluaapi.services;

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
    	imageRepository.deleteById(serial);
    }

    public ResponseEntity<Object> updateImage(Integer serial, Image image) {
        Optional<Image> imageOptional = imageRepository.findById(serial);

        Image existingImages = imageOptional.get();
        existingImages.setUrl(image.getUrl());
        existingImages.setLabel(image.getLabel());
        existingImages.setSerial(image.getSerial());
        
        Image updateImages = imageRepository.save(existingImages);
        return ResponseEntity.status(HttpStatus.OK).body(updateImages);
    }
}