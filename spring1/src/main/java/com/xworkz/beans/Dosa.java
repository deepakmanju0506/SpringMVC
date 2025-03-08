package com.xworkz.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Component
public class Dosa {

    private int id;
    private String type;
    private Double price;

}
