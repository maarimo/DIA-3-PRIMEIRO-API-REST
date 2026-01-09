package com.example.primeiro_api_rest.service;

import com.example.primeiro_api_rest.dto.ProfessorCreateDTO;
import com.example.primeiro_api_rest.dto.ProfessorDTO;
import com.example.primeiro_api_rest.entity.ProfessorEntity;
import com.example.primeiro_api_rest.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorDTO> listarDTO() {
        return professorRepository.findAll()
                .stream()
                .map(p -> new ProfessorDTO(p.getId(), p.getNome()))
                .toList();
    }

    public ProfessorDTO criar(ProfessorCreateDTO dto) {
        ProfessorEntity professor = new ProfessorEntity();
        professor.setNome(dto.getNome());

        ProfessorEntity salvo = professorRepository.save(professor);

        return new ProfessorDTO(salvo.getId(), salvo.getNome());
    }


    //LISTAR
    public List<ProfessorEntity> listar(){
        return professorRepository.findAll();
    }

    //CRIAR
    public ProfessorEntity criar(ProfessorEntity professor){
        return professorRepository.save(professor);
    }
}
