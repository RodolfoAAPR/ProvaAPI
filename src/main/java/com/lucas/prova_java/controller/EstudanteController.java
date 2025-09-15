package com.lucas.prova_java.controller;

import com.lucas.prova_java.model.Estudante;
import com.lucas.prova_java.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public Estudante cadastrarEstudante(@RequestBody Estudante estudante){
        return estudanteService.cadastrarEstudante(estudante);
    }

    @GetMapping
    public List<Estudante> listarEstudantes(){
        return estudanteService.listarEstudantes();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarEstudante(@PathVariable Long id){
        return this.estudanteService.deletarEstudante(id);
    }
}
