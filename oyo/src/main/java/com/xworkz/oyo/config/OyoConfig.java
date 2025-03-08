package com.xworkz.oyo.config;

import com.xworkz.oyo.rooms.Rooms;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.xworkz.oyo")
public class OyoConfig {

    @Bean
    public Integer getIntegerValue(){
        Integer integer =125;
        return integer;
    }
    @Bean
public Byte getByteValue(){
        Byte aByte = 11;
        return aByte;
}
@Bean
public Short getShortValue(){
        Short aShort = 55;
        return aShort;
}
@Bean
public Long getLongValue(){
        Long aLong = 6363827480L;
        return aLong;
}
@Bean
public Character getCharacterValue(){
        Character character = 'a';
        return character;
}
@Bean
public Boolean getBooleanValue(){
        Boolean aBoolean = true;
        return aBoolean;
}
@Bean("st")
public String getStringValue(){
        String string = "Deepak";
        return string;
}

@Bean("strings")
public String getString(){
        String string = "BABA";
        return string;
}
@Bean
    public Double getDoubleValue(){
        Double aDouble = 66.52D;
        return aDouble;
}
@Bean
    public Float getFloatValue(){
        Float aFloat = 66.3666f;
        return aFloat;
}

@Bean
public List getIntegerListValue(){
        return new ArrayList();
}
@Bean
    public List getStringListValue(){
        return new ArrayList();
}

@Bean

}
