package com.xworkz.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter@Setter
@Component
public class Car {
    private int id;
    private String brand;
    private String color;
    @Value("Hebbal")
    private String showRoom;

    @Autowired
    public Car(@Value("2")int id,@Value("Benz")String brand,@Value("Black")String color){
         this.id = id;
         this.brand = brand;
         this.color = color;
    }

}
