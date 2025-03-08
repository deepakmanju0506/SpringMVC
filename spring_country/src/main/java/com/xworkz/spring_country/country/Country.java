package com.xworkz.spring_country.country;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Country {

    @Value("1")
    private int id;

    @Value("India")
    private String name;

    @Value("140000000")
    private long population;



}
