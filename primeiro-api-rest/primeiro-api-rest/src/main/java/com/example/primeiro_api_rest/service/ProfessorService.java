package com.example.primeiro_api_rest.service;

import com.example.primeiro_api_rest.dto.ProfessorCreateDTO;
import com.example.primeiro_api_rest.dto.ProfessorDTO;
import com.example.primeiro_api_rest.entity.ProfessorEntity;
import com.example.primeiro_api_rest.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    private ProfessorDTO toDTO(ProfessorEntity professor){
        ProfessorDTO dto = new ProfessorDTO();
        dto.setId(professor.getId());
        dto.setNome(professor.getNome());
        return dto;
    }

    //listar
    public List<ProfessorDTO> listarDTO() {
        List<ProfessorEntity> professores = professorRepository.findAll();
        List<ProfessorDTO> dtos = new ArrayList<>();

        for (ProfessorEntity p : professores){
            dtos.add(toDTO(p));
        }

        return dtos;
    }

    //criar
    public ProfessorDTO criar(ProfessorCreateDTO dto) {
        ProfessorEntity professor = new ProfessorEntity();
        professor.setNome(dto.getNome());

        ProfessorEntity salvo = professorRepository.save(professor);

        return toDTO(salvo);
    }
}
