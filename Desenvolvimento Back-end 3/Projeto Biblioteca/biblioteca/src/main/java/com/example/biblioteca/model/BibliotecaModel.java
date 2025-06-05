package com.example.biblioteca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_biblioteca")
@Getter
@Setter
public class BibliotecaModel {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="titulo", length = 200)
    private String titulo;

    @Column(name="isbn", length = 20)
    private String isbn;

    @Column(name = "autor", length = 100)
    private String autor;

    @Column(name = "genero", length = 20)
    private String genero;

    @Column(name = "data_publicacao")
    private LocalDate data_publicacao;
}
