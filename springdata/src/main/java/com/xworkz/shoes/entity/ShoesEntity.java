package com.xworkz.shoes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name ="shoes")
public class ShoesEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column(name="brand")
    private String brand;
@Column(name= "price")
    private Integer price;
@Column(name="type")
    private String type;
}
