package com.example.primeiro_api_rest.repository;

import com.example.primeiro_api_rest.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
}
