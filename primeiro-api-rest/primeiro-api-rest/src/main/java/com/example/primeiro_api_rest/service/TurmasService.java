package com.example.primeiro_api_rest.service;

import com.example.primeiro_api_rest.dto.TurmasCreateDTO;
import com.example.primeiro_api_rest.dto.TurmasDTO;
import com.example.primeiro_api_rest.entity.ProfessorEntity;
import com.example.primeiro_api_rest.entity.TurmasEntity;
import com.example.primeiro_api_rest.repository.ProfessorRepository;
import com.example.primeiro_api_rest.repository.TurmasRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TurmasService {

    private final TurmasRepository turmasRepository;
    private final ProfessorRepository professorRepository;

    public TurmasService(TurmasRepository turmasRepository,
                         ProfessorRepository professorRepository) {
        this.turmasRepository = turmasRepository;
        this.professorRepository = professorRepository;
    }

    private TurmasDTO toDTO(TurmasEntity turma){
        return new TurmasDTO(turma.getId(), turma.getNome());
    }

    // LISTAR
    public List<TurmasDTO> listarDTO(){
        List<TurmasEntity> turmas = turmasRepository.findAll();
        List<TurmasDTO> dtos = new ArrayList<>();

        for (TurmasEntity t : turmas) {
            dtos.add(toDTO(t));
        }

        return dtos;
    }

    // CRIAR
    public TurmasDTO criar(TurmasCreateDTO dto){

        TurmasEntity turma = new TurmasEntity();
        turma.setNome(dto.getNome());

        // buscar professor
        ProfessorEntity professor = professorRepository.findById(dto.getProfessorId())
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        turma.setProfessor(professor);

        TurmasEntity salvo = turmasRepository.save(turma);

        return toDTO(salvo);
    }

    //BUSCAR POR ID
    public TurmasDTO buscarPorId(Long id){
        TurmasEntity turmas = turmasRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Turma não encontrada"));

        return toDTO(turmas);
    }

    //DELETE
    public void deletar(Long id){
        TurmasEntity turmas = turmasRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Turma não encontrada"));
        turmasRepository.delete(turmas);
    }
}
