package com.xworkz.shoes.runner;

import com.xworkz.App;
import com.xworkz.Configuer;
//import com.xworkz.shoes.configur.ShoesConfig;
import com.xworkz.shoes.dto.ShoesDto;
import com.xworkz.shoes.service.ShoesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoesRunner {

    public static void main(String[] args) {
        System.out.println("Hello world");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuer.class);
        ShoesService shoesService = applicationContext.getBean(ShoesService.class);
        ShoesDto shoesDto = new ShoesDto();
        shoesDto.setBrand("NIKE");
        shoesDto.setPrice(10000);
        shoesDto.setType("Sports");

        shoesService.validateAndSave(shoesDto);
    }
}
