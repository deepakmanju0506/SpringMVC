package com.xworkz.chocolate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="chocolates")
public class ChocolateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column(name="brandName")
    private String brandName;
@Column(name="calories")
    private String calories;
@Column(name="grams")
    private String grams;
}
