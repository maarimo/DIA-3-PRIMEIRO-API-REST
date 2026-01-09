package com.example.primeiro_api_rest.service;

import com.example.primeiro_api_rest.entity.TurmasEntity;
import com.example.primeiro_api_rest.repository.TurmasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmasService {

    private final TurmasRepository turmasRepository;

    public TurmasService(TurmasRepository turmasRepository) {
        this.turmasRepository = turmasRepository;
    }

    //LISTAR
    public List<TurmasEntity> listar(){
        return turmasRepository.findAll();
    }

    //CRIAR
    public TurmasEntity criar(TurmasEntity turma){
        return turmasRepository.save(turma);
    }
}
