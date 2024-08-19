package com.example.democleansimple.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Game {
    @Id
    @Column
    private Long id;
    @Column
    private String name;
}
