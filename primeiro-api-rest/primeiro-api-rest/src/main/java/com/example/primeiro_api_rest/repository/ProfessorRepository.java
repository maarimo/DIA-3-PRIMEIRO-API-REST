package com.example.primeiro_api_rest.repository;

import com.example.primeiro_api_rest.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
    Optional<ProfessorEntity> findById(Long id);
}
