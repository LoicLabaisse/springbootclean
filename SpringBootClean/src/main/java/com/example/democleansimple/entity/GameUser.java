package com.example.democleansimple.entity;

import com.example.democleansimple.entity.enumeration.Role;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class GameUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Integer age;
    @Column
    private Role role;
}
