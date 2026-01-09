package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.entity.TurmasEntity;
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
    public List<TurmasEntity> listar(){
        return turmasService.listar();
    }

    //POST
    @PostMapping
    public TurmasEntity criar(@RequestBody TurmasEntity turmas){
        return turmasService.criar(turmas);
    }
}
