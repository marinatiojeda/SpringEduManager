package com.springedumanager.springedumanager.service;

import com.springedumanager.springedumanager.model.Estudiante;
import com.springedumanager.springedumanager.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
    public java.util.List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }
    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}