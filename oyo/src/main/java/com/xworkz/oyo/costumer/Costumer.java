package com.xworkz.oyo.costumer;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Costumer {

    @Value("62")
    private int id;

    @Value("Suresh")
    private String costumerName;

    @Value("6363748280")
    private long phNo;
}
