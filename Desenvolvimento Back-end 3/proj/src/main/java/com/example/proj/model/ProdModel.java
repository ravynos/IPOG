package com.example.proj.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_prod")
@Getter
@Setter
public class ProdModel {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="nome", length=40)
    private String nome;

    @Column(name = "preco", length = 5)
    private float preco;


}
