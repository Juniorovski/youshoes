package com.juniormeloDev.YouShoes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String nameCategory;
}