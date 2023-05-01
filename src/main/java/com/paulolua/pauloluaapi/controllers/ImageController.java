package com.paulolua.pauloluaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paulolua.pauloluaapi.models.Image;
import com.paulolua.pauloluaapi.repositories.ImageRepository;

//annotation que indica o controller
@RestController
//cria a classe do controller
public class ImageController {

    //annotation para usar as configurações nas dependências. não precisa saber como funciona, vc sempre usa pq sempre precisa usar, ponto.
    @Autowired
    //aqui a classe ImageRepository é chamada criando um repositório chamado imageRepository. atenção a letra maiúscula, todas as classes começam em letra maiúscula. 
    //sobre a síntaxe, ImageRepository é a classe, atua como o tipo da variável. imageRepository é o nome da variável.
    private ImageRepository imageRepository;

    //aqui define o mapeamento desse método, ou seja, qual a url que vai chamar ele. a url padrão desse serviço é localhost:8080, e essa annotation define um mapeamento para get em /image, ou seja, localhost:8080/image no navegador vai retornar o resultado desse método
    @GetMapping("/image")
    public List<Image> getImage(){
        //esse método cria uma lista da classe Image, que será armazenada numa variável chamada images. essa lista vai receber tudo o que for encontrado no imageRepository;
        List<Image> images = imageRepository.findAll();
        return images;
    }

    //também um método, mas vai postar uma imagem
    @PostMapping("/image")
    //passa como parâmetro uma variável tipo Image, chamada image, de acordo com a classe Image :)
    public Image postImage(@RequestBody Image image){
        //aqui salva a imagem no repositório
        Image savedImage = imageRepository.save(image);
        //retorna a imagem que foi salva
        return savedImage;
        //sendo um método post, o navegador só consegue fazer get., então pra testar isso vc precisa de um aplicativo pra isso (postman, insomnia, ou o thunderclient, que é uma extensão do vscode, recomendo)
    }
}