package com.springedumanager.springedumanager.controller;

import com.springedumanager.springedumanager.model.Curso;
import com.springedumanager.springedumanager.service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/cursos")
    public String cursos(Model model) {
        model.addAttribute("cursos", cursoService.listar());
        return "cursos";
    }

    @PostMapping("/cursos")
    public String guardarCurso(
            @RequestParam String nombre,
            @RequestParam String descripcion) {

        Curso curso = new Curso();
        curso.setNombre(nombre);
        curso.setDescripcion(descripcion);

        cursoService.guardar(curso);

        return "redirect:/cursos";
    }
}