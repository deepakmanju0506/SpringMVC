package com.xworkz.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Beans {
    private int id;
    private String name;
    private int price;

   @Value("Zepto")
    private String vender;

    @Autowired
    public Beans(@Value("10")int id, @Value("Fram")String name,@Value("35")int price){

        this.id= id;
        this.name=name;
        this.price=price;

    }



}

























