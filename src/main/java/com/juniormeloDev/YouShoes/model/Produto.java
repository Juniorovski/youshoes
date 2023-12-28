package com.juniormeloDev.YouShoes.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "tb-produto")
public class Produto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String nameProduto;
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    private String description;
    @ManyToMany(cascade = CascadeType.ALL)
    List< Category> category;



}
