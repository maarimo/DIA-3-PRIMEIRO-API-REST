package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.dto.TurmasCreateDTO;
import com.example.primeiro_api_rest.dto.TurmasDTO;
import com.example.primeiro_api_rest.service.TurmasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmasController {

    private final TurmasService turmasService;

    public TurmasController(TurmasService turmasService) {
        this.turmasService = turmasService;
    }

    //GET
    @GetMapping
    public List<TurmasDTO> listarDTO(){
        return turmasService.listarDTO();
    }

    //POST
    @PostMapping
    public TurmasDTO criar(@RequestBody TurmasCreateDTO turmas){
        return turmasService.criar(turmas);
    }

    //GETiD
    @GetMapping("/{id}")
    public TurmasDTO buscarPorId(@PathVariable Long id){
        return turmasService.buscarPorId(id);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        turmasService.deletar(id);
    }
}
