package com.juniormeloDev.YouShoes.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
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
    private Stock stock;
    @Getter
    @Setter
    private String description;
    @ManyToMany
    @JoinColumn(name ="category_id")
    private Category category;
}
