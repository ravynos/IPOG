package com.example.biblioteca.service;

import com.example.biblioteca.model.BibliotecaModel;
import com.example.biblioteca.model.RespostaModel;
import com.example.biblioteca.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;
    @Autowired
    private RespostaModel respostaModel;

    //Metodo para listar todos os livros da Biblioteca
    public Iterable<BibliotecaModel> listarTodos() {
        return bibliotecaRepository.findAll();
    }

    //Metodo para cadastar ou alterar livros
    public ResponseEntity<?> cadastrarAlterar(BibliotecaModel bibliotecaModel, String acao) {

        if (bibliotecaModel.getTitulo().equals("")) {
            respostaModel.setMensagem("O título do livro e obrigatório");
            return new ResponseEntity<>(respostaModel, HttpStatus.BAD_REQUEST);
        } else if (bibliotecaModel.getIsbn().equals("")) {
            respostaModel.setMensagem("O isbn do livro e obrigatório");
            return new ResponseEntity<>(respostaModel, HttpStatus.BAD_REQUEST);
        } else if (bibliotecaModel.getAutor().equals("")) {
            respostaModel.setMensagem("O autor do livro e obrigatório");
            return new ResponseEntity<>(respostaModel, HttpStatus.BAD_REQUEST);
        } else if (bibliotecaModel.getGenero().equals("")) {
            respostaModel.setMensagem("O genero do livro e obrigatório");
            return new ResponseEntity<>(respostaModel, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")){
                return new ResponseEntity<>(bibliotecaRepository.save(bibliotecaModel), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(bibliotecaRepository.save(bibliotecaModel), HttpStatus.OK);
            }
        }
    }

    //Metodo para remover livros
    public ResponseEntity<RespostaModel> excluir(Long id) {
        bibliotecaRepository.deleteById(id);
        respostaModel.setMensagem("Livro removido!");
        return new ResponseEntity<>(respostaModel, HttpStatus.OK);
    }
}