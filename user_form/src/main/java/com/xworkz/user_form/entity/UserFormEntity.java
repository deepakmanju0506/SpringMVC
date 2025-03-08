package com.xworkz.user_form.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "userform_table")
@NamedQuery(name = "findAll", query = "SELECT ue FROM UserFormEntity ue")
@NamedQuery(name="deleteUser", query = "Delete From UserFormEntity where id = :id")
@NamedQuery(name = "findById", query = "select ue From UserFormEntity ue where ue.id = :id")
public class UserFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long contactNo;
}
