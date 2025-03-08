package com.xworkz.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Traffic {
    private int id;
    private String policeName;
    private String post;

}
