package com.xworkz;

import com.xworkz.fan.configure.FanConfig;
import com.xworkz.fan.dto.FanDto;
import com.xworkz.fan.service.FanService;
import com.xworkz.fan.service.FanServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FanConfig.class);
        FanService fanService = applicationContext.getBean(FanService.class);
        FanDto fanDto = new FanDto();
        fanDto.setBrand("HIGH FLO");
        fanDto.setPrice(5000);
        fanDto.setType("Table Fan");

        fanService.ValiDateAndSave(fanDto);
    }
}
