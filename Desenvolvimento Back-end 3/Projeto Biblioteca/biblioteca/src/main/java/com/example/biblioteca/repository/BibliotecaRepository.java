package com.example.biblioteca.repository;

import com.example.biblioteca.model.BibliotecaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends CrudRepository<BibliotecaModel, Long> {
}
