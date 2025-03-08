package com.xworkz.train_form.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("No-Args Const is created");
    }
}
