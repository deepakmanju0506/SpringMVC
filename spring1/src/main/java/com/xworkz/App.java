package com.xworkz;

import com.xworkz.beans.*;
import com.xworkz.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.spec.RSAOtherPrimeInfo;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
//        Beans beans = applicationContext.getBean(Beans.class);
//        beans.setId(1);
//        beans.setName("Natti");
//        beans.setPrice(150);
//        System.out.println( beans.toString() );


               Dosa dosa = applicationContext.getBean(Dosa.class);
               dosa.setId(1);
               dosa.setType("Set Dosa");
               dosa.setPrice(55.25);
//
//               Car car =applicationContext.getBean(Car.class);
//               car.setId(1);
//               car.setBrand("BMW");
//               car.setColor("Black");

        Trainer trainer =applicationContext.getBean(Trainer.class);
        trainer.setId(1);
        trainer.setTrainerName("Omkar");
        trainer.setPhNo(6363824780l);

        System.out.println(trainer.toString());

        Trainer trainer1 =applicationContext.getBean(Trainer.class);
        trainer.setId(2);
        trainer.setTrainerName("Dev");
        trainer.setPhNo(9963584456l);


         Traffic traffic = applicationContext.getBean(Traffic.class);
         traffic.setId(1);
         traffic.setPoliceName("Huli");
         traffic.setPost("SI");

       Beans beans1 =applicationContext.getBean(Beans.class);
        System.out.println(beans1);

     Car car1 = applicationContext.getBean(Car.class);
        System.out.println(car1);


//        System.out.println(car.toString());
        System.out.println(dosa.toString());
        System.out.println(trainer1.toString());

    }
}
