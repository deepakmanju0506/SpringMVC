package com.xworkz.oyo.rooms;


import com.xworkz.oyo.costumer.Costumer;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Rooms {

    @Value("5")
    private int id;

    @Value("OYO Rooms")
    private String hotelName;

    @Value("Ritesh Agarwal")
    private String ownerName;

    @Autowired
    Costumer costumer;
}
