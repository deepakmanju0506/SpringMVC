package com.xworkz.spring_country.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table(name="country_info")
@AllArgsConstructor
@NoArgsConstructor
public class CountryEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
@Column(name="name")
    private String name;
@Column(name = "population")
    private Integer popoulation;
}
