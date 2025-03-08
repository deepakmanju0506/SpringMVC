package com.xworkz.user_form.service;

import com.xworkz.user_form.dto.UserFormDto;
import com.xworkz.user_form.entity.UserFormEntity;
import com.xworkz.user_form.repository.UserFormRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserFormServiceImpl implements UserFormService{
@Autowired
    UserFormRepository formRepository;

public UserFormServiceImpl(){
    System.out.println("NO-Args Const of UserFromServiceImpl");
}

  UserFormDto userFormDto = new UserFormDto();
    @Override
    public boolean validateSave(UserFormDto userFormDto) {
        UserFormEntity formEntity = new UserFormEntity();

        formEntity.setFirstName(userFormDto.getFirstName());
        formEntity.setLastName(userFormDto.getLastName());
        formEntity.setEmail(userFormDto.getEmail());
        formEntity.setContactNo(userFormDto.getContactNo());

        formRepository.save(formEntity);
        return true;
    }

    @Override
    public List<UserFormDto> getAll() {
        List<UserFormDto> userFormDtos =new ArrayList<>();
        List<UserFormEntity> userFormEntities = formRepository.getAll();
        for(UserFormEntity formEntity : userFormEntities){
            UserFormDto dto = new UserFormDto();
            BeanUtils.copyProperties(formEntity,dto);
            userFormDtos.add(dto);

        }
        return userFormDtos;
    }

    @Override
    public void deleteUserById(Integer id) {
      formRepository.deleteUserById(id);
    }

    @Override
    public UserFormDto findById(Integer id) {
        UserFormDto userFromDto = new UserFormDto();
        UserFormEntity userFormEntity = formRepository.findById(id);

        BeanUtils.copyProperties(userFormEntity,userFromDto);
        System.out.println("Service :"+userFormEntity);
        return userFromDto;
    }

    @Override
    public boolean updateUser(UserFormDto userFormDto) {
        UserFormEntity userFormEntity = new UserFormEntity();
        BeanUtils.copyProperties(userFormDto,userFormEntity);

        formRepository.updateUser(userFormEntity);
        return true;
    }
}
