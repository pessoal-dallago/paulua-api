//define o nome do pacote. coisa do springboot, não precisa entender.
package com.paulolua.pauloluaapi.models;

//importações. é como o #include do c++, serve pra usar comandos que não existem no Java padrão
//muito raramente vc precisa escrever isso manualmente. uma IDE bem configurada faz isso sozinha (ou apertando com o botão direito no código que precisa da importação [ou ctrl + .])
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//específica o nome da coleção do banco de dados, nesse caso, é images.
//esse @ é chamado uma annotation, é uma funcionalidade do springboot que faz tipo uma mágica, faz as coisas sozinho. define o q tem q ser feito e faz sozinho, por isso não tem ; no fim
@Document(collection="images")
//aqui de fato é criada a classe Image
//public significa que pode ser acessada por todas as outras classes do projeto
//o nome da classe sempre tem que ser igual ao nome do arquivo
public class Image {

    //aqui cria as variáveis que vão criar um objeto imagem
    @Id
    //aqui private significa que essas variáveis só existem dentro dessa classe
    private String id;
    private String url;
    private String label;

    public Image() {
        // ???
    }

    //aqui é o contructor, que constrói a imagem, recebendo valores como parametro que são atribuídos às variáveis da classe.
    public Image(String id, String url, String label){

        this.id=id;
        this.url=url;
        this.label=label;
    }

    //esses são os métodos. é bem simples: getId, por exemplo, vc quer receber o id, o método retorna o id. simples.
    public String getId(){
        return id;
    }
    public String getUrl(){
        return url;
    }
    public String getLabel(){
        return label;
    }
}

//cabo. agr veja o controller