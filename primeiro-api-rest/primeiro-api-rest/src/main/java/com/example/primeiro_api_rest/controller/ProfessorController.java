package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.dto.ProfessorCreateDTO;
import com.example.primeiro_api_rest.dto.ProfessorDTO;
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
    public List<ProfessorDTO> listar(){
        return professorService.listarDTO();
    }

    //POST
    @PostMapping
    public ProfessorDTO criar(@RequestBody ProfessorCreateDTO dto){
        return professorService.criar(dto);
    }

}
