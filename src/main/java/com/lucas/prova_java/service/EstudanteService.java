package com.lucas.prova_java.service;

import com.lucas.prova_java.model.Estudante;
import com.lucas.prova_java.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public Estudante cadastrarEstudante(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> listarEstudantes(){
        return estudanteRepository.findAll();
    }

    public ResponseEntity<String> deletarEstudante(Long id){
        this.estudanteRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
