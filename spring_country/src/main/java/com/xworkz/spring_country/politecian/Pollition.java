package com.xworkz.spring_country.politecian;

import com.xworkz.spring_country.country.Country;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pollition {

    @Value("100")
    private int id;
    @Value("Modi")
    private String name;
    @Value("65")
    private int age;

    @Autowired
    Country country;
}
