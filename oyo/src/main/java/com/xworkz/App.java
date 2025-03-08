package com.xworkz;

import com.xworkz.oyo.config.OyoConfig;
import com.xworkz.oyo.rooms.Rooms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OyoConfig.class);
        Rooms rooms = applicationContext.getBean(Rooms.class);
        rooms.getId();
        rooms.getHotelName();
        rooms.getOwnerName();
        rooms.getCostumer();
        System.out.println(rooms.toString());

        Integer integer = applicationContext.getBean(Integer.class);
        System.out.println(integer);

        Byte aByte = applicationContext.getBean(Byte.class);
        System.out.println(aByte);

        Short aShort = applicationContext.getBean(Short.class);
        System.out.println(aShort);

        Long aLong = applicationContext.getBean(Long.class);
        System.out.println(aLong);

        Character character = applicationContext.getBean(Character.class);
        System.out.println(character);

        Boolean aBoolean = applicationContext.getBean(Boolean.class);
        System.out.println(aBoolean);

        Double aDouble = applicationContext.getBean(Double.class);
        System.out.println(aDouble);

        Float aFloat = applicationContext.getBean(Float.class);
        System.out.println(aFloat);

        List list = applicationContext.getBean("getIntegerListValue",List.class);
        list.add(65);
        list.add(75);
        System.out.println(list);

        List list1 = applicationContext.getBean("getStringListValue", List.class);
        list1.add("Deepak");
        list1.add("BABA");
        System.out.println(list1);

        String string = applicationContext.getBean("strings",String.class);
        System.out.println(string);

        String string1 = applicationContext.getBean("st", String.class);
        System.out.println(string1);
    }
}
