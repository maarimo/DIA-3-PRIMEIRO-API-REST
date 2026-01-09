package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.entity.ProfessorEntity;
import com.example.primeiro_api_rest.repository.ProfessorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorRepository professorRepository;

    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    //GET
    @GetMapping
    public List<ProfessorEntity> listar(){
        return professorRepository.findAll();
    }

    //POST
    @PostMapping
    public ProfessorEntity criar (@RequestBody ProfessorEntity professor){
        return professorRepository.save(professor);
    }
}
