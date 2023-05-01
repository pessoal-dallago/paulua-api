//nome do pacote dnv, tem isso em todos os arquivos
package com.paulolua.pauloluaapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paulolua.pauloluaapi.models.Image;

//aqui é bem simples. isso é uma interface, que no caso é tipo uma adaptação de outra classe. essa adapta a classe MongoRepository, que não tá nessa pasta aqui, ela é importada de uma rede externa como vc pode ver pelas importações.
//então nada é feito aqui, a não ser botar entre o <> qual classe vai ser usada como construtora e o que ela retorna
public interface ImageRepository extends MongoRepository<Image, String>{
    
}
//agr veja o controller