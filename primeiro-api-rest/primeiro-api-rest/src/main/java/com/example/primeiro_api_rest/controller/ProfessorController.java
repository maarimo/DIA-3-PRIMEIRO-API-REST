package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.dto.ProfessorCreateDTO;
import com.example.primeiro_api_rest.dto.ProfessorDTO;
import com.example.primeiro_api_rest.dto.ProfessorUpdateDTO;
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

    //GETiD
    @GetMapping("/{id}")
    public ProfessorDTO buscarPorId(@PathVariable Long id){
        return professorService.buscarPorId(id);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        professorService.deletar(id);
    }

    //UPDATE
    @PutMapping("/{id}")
    public ProfessorDTO atualizar(
            @PathVariable Long id,
            @RequestBody ProfessorUpdateDTO dto
    ){
        return professorService.atualizar(id, dto);
    }

}
