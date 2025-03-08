package com.xworkz.train_form.service;

import com.xworkz.train_form.dto.TrainDto;
import com.xworkz.train_form.entity.TrainEntity;

import java.util.List;

public interface TrainService {
    boolean validDateAndSave(TrainDto trainDto);

    List<TrainDto> getAll();

    void removeData(int id);

    TrainEntity findAll(int id);

    boolean updateData(TrainDto trainDto);
}
