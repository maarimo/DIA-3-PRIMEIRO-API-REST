package com.example.primeiro_api_rest.controller;

import com.example.primeiro_api_rest.entity.TurmasEntity;
import com.example.primeiro_api_rest.repository.TurmasRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmasController {

    private final TurmasRepository turmasRepository;

    public TurmasController(TurmasRepository turmasRepository) {
        this.turmasRepository = turmasRepository;
    }

    //GET
    @GetMapping
    public List<TurmasEntity> listar(){
        return turmasRepository.findAll();
    }

    //POST
    @PostMapping
    public TurmasEntity criar(@RequestBody TurmasEntity turmas){
        return turmasRepository.save(turmas);
    }
}
