package com.example.biblioteca.controller;


import com.example.biblioteca.model.BibliotecaModel;
import com.example.biblioteca.model.RespostaModel;
import com.example.biblioteca.repository.BibliotecaRepository;
import com.example.biblioteca.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;
    @Autowired
    private RespostaModel respostaModel;
    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    @GetMapping("/listar")
    public Iterable<BibliotecaModel> listarTodos(){
        return bibliotecaService.listarTodos();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(BibliotecaModel bibliotecaModel){
        return bibliotecaService.cadastrar(bibliotecaModel);
    }

    @GetMapping("")
    public String rota() {
        return "API Funcionando!!!";
    }
}
