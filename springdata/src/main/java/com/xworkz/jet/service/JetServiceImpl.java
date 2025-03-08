package com.xworkz.jet.service;

import com.xworkz.jet.dto.JetDto;
import com.xworkz.jet.entity.JetEntity;
import com.xworkz.jet.repository.JetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JetServiceImpl implements JetService{

    @Autowired
    JetRepository jetRepository;
    @Override
    public boolean validateAndSave(JetDto jetDto) {
        JetEntity jetEntity = new JetEntity();
        jetEntity.setName(jetDto.getName());
        jetEntity.setSpeed(jetDto.getSpeed());
        jetEntity.setModel(jetDto.getModel());
        return jetRepository.save(jetEntity);
    }
}
