package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.entity.ProfessorEntity;
import com.example.primeiro_api_rest.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


    //GET
    @GetMapping
    public List<ProfessorEntity> listar(){
        return professorService.listar();
    }

    //POST
    @PostMapping
    public ProfessorEntity criar (@RequestBody ProfessorEntity professor){
        return professorService.criar(professor);
    }
}
