package com.springedumanager.springedumanager.controller;

import com.springedumanager.springedumanager.model.Estudiante;
import com.springedumanager.springedumanager.service.EstudianteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/estudiantes")
    public String estudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteService.listar());
        return "estudiantes";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(
            @RequestParam String nombre,
            @RequestParam String email) {

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEmail(email);

        estudianteService.guardar(estudiante);

        return "redirect:/estudiantes";
    }
}