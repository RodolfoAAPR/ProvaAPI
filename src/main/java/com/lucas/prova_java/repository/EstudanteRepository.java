package com.lucas.prova_java.repository;

import com.lucas.prova_java.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
