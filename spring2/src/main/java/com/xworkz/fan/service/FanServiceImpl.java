package com.xworkz.fan.service;

import com.xworkz.fan.dto.FanDto;
import com.xworkz.fan.entity.FanEntity;
import com.xworkz.fan.repository.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanServiceImpl implements FanService{
@Autowired
    FanRepository fanRepository;

    @Override
    public boolean ValiDateAndSave(FanDto fanDto) {
        FanEntity fanEntity = new FanEntity();
        fanEntity.setBrand(fanDto.getBrand());
        fanEntity.setPrice(fanDto.getPrice());
        fanEntity.setType(fanDto.getType());
        return fanRepository.save(fanEntity);


    }
}
