package com.xworkz.fan.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="fan_info")
public class FanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="brand")
    private String brand;
    @Column(name="price")
    private Integer price;
    @Column(name="type")
    private String type;
}
