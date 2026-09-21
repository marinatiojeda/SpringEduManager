package com.springedumanager.springedumanager.repository;

import com.springedumanager.springedumanager.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}