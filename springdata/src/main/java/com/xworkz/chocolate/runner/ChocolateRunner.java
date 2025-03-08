package com.xworkz.chocolate.runner;


import com.xworkz.App;
import com.xworkz.Configuer;
//import com.xworkz.chocolate.configur.ChocolateConfig;
import com.xworkz.chocolate.dto.ChocolateDto;
import com.xworkz.chocolate.service.ChocolateService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChocolateRunner {
    public static void main(String[] args) {
        System.out.println("hello world");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuer.class);
        ChocolateService chocolateService = applicationContext.getBean(ChocolateService.class);
        ChocolateDto chocolateDto = new ChocolateDto();
        chocolateDto.setBrandName("Cadbury");
        chocolateDto.setCalories("230 calories");
        chocolateDto.setGrams("100g");

        chocolateService.validateAndSave(chocolateDto);
    }
}
