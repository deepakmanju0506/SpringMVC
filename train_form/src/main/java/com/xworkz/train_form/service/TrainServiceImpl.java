package com.xworkz.train_form.service;

import com.xworkz.train_form.dto.TrainDto;
import com.xworkz.train_form.entity.TrainEntity;
import com.xworkz.train_form.repository.TrainRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class TrainServiceImpl implements TrainService{

    @Autowired
    TrainRepository trainRepository;
    @Override
    public boolean validDateAndSave(TrainDto trainDto) {
        TrainEntity trainEntity = new TrainEntity();
        BeanUtils.copyProperties(trainDto,trainEntity);
        trainRepository.save(trainEntity);
        return false;
    }

    @Override
    public List<TrainDto> getAll() {
        List<TrainDto>trainDtos = new ArrayList<>();
        List<TrainEntity>trainEntities = trainRepository.getAll();
        for(TrainEntity entity : trainEntities){
            TrainDto dto = new TrainDto();
            BeanUtils.copyProperties(entity,dto);
            trainDtos.add(dto);
        }
        return trainDtos;
    }

    @Override
    public void removeData(int id) {
trainRepository.removeData(id);
    }

    @Override
    public TrainEntity findAll(int id) {
        System.out.println("SERVICE :"+trainRepository.findAll(id));
        return trainRepository.findAll(id);
    }

    @Override
    public boolean updateData(TrainDto trainDto) {

        TrainEntity trainEntity = new TrainEntity();
        BeanUtils.copyProperties(trainDto,trainEntity);

        trainRepository.updateData(trainEntity);
        return true;
    }
}
