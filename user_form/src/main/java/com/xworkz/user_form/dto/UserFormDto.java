package com.xworkz.user_form.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserFormDto {
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long contactNo;


}
