package com.xworkz.chocolate.service;

import com.xworkz.chocolate.dto.ChocolateDto;
import com.xworkz.chocolate.entity.ChocolateEntity;
import com.xworkz.chocolate.repository.ChocolateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChocolateServiceImpl implements  ChocolateService{

    @Autowired
    ChocolateRepo chocolateRepo;

    ChocolateEntity chocolateEntity = new ChocolateEntity();
    @Override
    public boolean validateAndSave(ChocolateDto chocolateDto) {

        chocolateEntity.setBrandName(chocolateDto.getBrandName());
        chocolateEntity.setCalories(chocolateDto.getCalories());
        chocolateEntity.setGrams(chocolateDto.getGrams());
        return chocolateRepo.save(chocolateEntity);
    }
}



//        ChocolateEntity chocolateEntity = new ChocolateEntity();
//        chocolateEntity.setBrandName(chocolateDto.getBrandName());
//        chocolateEntity.setCalories(chocolateDto.getCalories());
//        chocolateEntity.setGrams(chocolateDto.getGrams());
//