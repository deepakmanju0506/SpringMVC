package com.xworkz.user_form.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.user_form")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("No-Args const of SpringConfiguration");
    }
}
