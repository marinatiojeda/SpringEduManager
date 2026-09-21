package com.springedumanager.springedumanager.service;

import com.springedumanager.springedumanager.model.Curso;
import com.springedumanager.springedumanager.repository.CursoRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public java.util.List<Curso> listar() {
        return cursoRepository.findAll();
    }
    public void eliminar(Long id) {
        cursoRepository.deleteById(id);
    }
}