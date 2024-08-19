package com.example.democleansimple.model;

import com.example.democleansimple.entity.enumeration.Role;
import lombok.Data;

@Data
public class GameUserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private Integer age;
    private Role role;
}
