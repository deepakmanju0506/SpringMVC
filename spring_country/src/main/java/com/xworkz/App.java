package com.xworkz;

import com.xworkz.spring_country.config.Config;
import com.xworkz.spring_country.country.Country;
import com.xworkz.spring_country.dto.CountryDto;
import com.xworkz.spring_country.politecian.Pollition;
import com.xworkz.spring_country.service.CountryService;
import com.xworkz.spring_country.service.CountryServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
//        Pollition pollition = applicationContext.getBean(Pollition.class);
//        pollition.getId();
//        pollition.getName();
//        pollition.getAge();
//
//        System.out.println(pollition.toString());

        CountryService countryService= applicationContext.getBean(CountryServiceImpl.class);
        CountryDto countryDto =new CountryDto();
        countryDto.setName("india");
        countryDto.setPopulation(140000000);

        countryService.ValidateAndSave(countryDto);


    }





}
