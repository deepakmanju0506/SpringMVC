package com.xworkz.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Trainer {

    private int id;
    private String trainerName;
    private long phNo;

}
