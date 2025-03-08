package com.xworkz.jet.runner;

import com.xworkz.Configuer;
//import com.xworkz.jet.configuer.JetConfig;
import com.xworkz.jet.dto.JetDto;
import com.xworkz.jet.entity.JetEntity;
import com.xworkz.jet.repository.JetRepositoryImpl;
import com.xworkz.jet.service.JetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JetRunner {

    public static void main(String[] args) {
        System.out.println("Hello world");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuer.class);
JetService jetService = applicationContext.getBean(JetService.class);
  JetDto jetDto = new JetDto();
  jetDto.setName("Lockheed YF-12");
  jetDto.setSpeed("2,275 mph");
  jetDto.setModel(4);

  jetService.validateAndSave(jetDto);

    }
}
