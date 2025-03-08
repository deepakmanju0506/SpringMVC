package com.xworkz.train_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainDto {

    private int id;

    private String source;

    private String destination;

    private int noOfMembers;
}
