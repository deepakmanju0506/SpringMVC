package com.xworkz.train_form.repository;

import com.xworkz.train_form.entity.TrainEntity;

import java.util.List;

public interface TrainRepository {

    boolean save(TrainEntity trainEntity);

    List<TrainEntity> getAll();

    void removeData(int id);

    TrainEntity findAll(Integer id);

    boolean updateData(TrainEntity trainEntity);
}
