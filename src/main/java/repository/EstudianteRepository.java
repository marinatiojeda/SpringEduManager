package com.springedumanager.springedumanager.repository;

import com.springedumanager.springedumanager.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}