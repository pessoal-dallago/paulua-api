package com.paulolua.pauloluaapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="images")
public class Image {

    @Id
    private String id;
    private String url;
    private String label;

    public Image() {
        
    }

    public Image(String id, String url, String label){

        this.id=id;
        this.url=url;
        this.label=label;
    }

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