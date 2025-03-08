package com.xworkz.spring_country.service;

import com.xworkz.spring_country.dto.CountryDto;
import com.xworkz.spring_country.entity.CountryEntity;
import com.xworkz.spring_country.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService{
@Autowired
    CountryRepo countryRepo;

    @Override
    public boolean ValidateAndSave(CountryDto countryDto) {

        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setName(countryDto.getName());
        countryEntity.setPopoulation(countryDto.getPopulation());
        return countryRepo.save(countryEntity) ;
    }
}
//CountryDto countryDto1 =new CountryDto();
//try{
//        BeanUtils.copyProperties(countryEntity,countryDto1);
//Boolean adder = countryRepo.save(countryEntity);
//    return adder;
//}catch (IllegalAccessError targetException){
//        targetException.getMessage();
//        }
//                return false;
//                }