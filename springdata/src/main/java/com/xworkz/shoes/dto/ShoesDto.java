package com.xworkz.shoes.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ShoesDto {

    private String brand;

    private Integer price;

    private String type;

}
