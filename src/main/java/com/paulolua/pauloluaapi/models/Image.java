package com.paulolua.pauloluaapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="images")
public class Image {

    @Id
    private String id;
    private String url;
    private String label;
    private Integer serial;
    
    public Image() {
        // ???
    }

    public Image(String id, String url, String label, Integer serial){

        this.id=id;
        this.url=url;
        this.label=label;
        this.serial=serial;
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
    public Integer getSerial(){
        return serial;
    }

    public void setUrl(String url) {
		this.url=url;
	}
    public void setLabel(String label) {
		this.label=label;
	}
    public void setSerial(Integer serial) {
        this.serial=serial;
	}
}