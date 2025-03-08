package com.xworkz.shoes.service;

import com.xworkz.shoes.dto.ShoesDto;
import com.xworkz.shoes.entity.ShoesEntity;
import com.xworkz.shoes.repository.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoesServiceImpl implements ShoesService {

    @Autowired
    ShoesRepository shoesRepository;
    @Override
    public boolean validateAndSave(ShoesDto shoesDto) {
        ShoesEntity shoesEntity = new ShoesEntity();
        shoesEntity.setBrand(shoesDto.getBrand());
        shoesEntity.setPrice(shoesDto.getPrice());
        shoesEntity.setType(shoesDto.getType());
        return shoesRepository.save(shoesEntity);
    }
}
