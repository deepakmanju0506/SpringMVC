package com.xworkz.user_form.service;

import com.xworkz.user_form.dto.UserFormDto;

import java.util.List;

public interface UserFormService {
    boolean validateSave(UserFormDto userFormDto);

    List<UserFormDto> getAll();

    void deleteUserById(Integer id);

    UserFormDto findById(Integer id);

    boolean updateUser(UserFormDto userFormDto);
}
