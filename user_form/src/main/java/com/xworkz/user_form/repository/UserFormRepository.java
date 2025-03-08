package com.xworkz.user_form.repository;

import com.xworkz.user_form.entity.UserFormEntity;

import java.util.Iterator;
import java.util.List;

public interface UserFormRepository {

    boolean save (UserFormEntity userFormEntity);

    List<UserFormEntity> getAll();

    void deleteUserById(Integer id);

    UserFormEntity findById(Integer id);

    boolean updateUser(UserFormEntity userFormEntity);

}
