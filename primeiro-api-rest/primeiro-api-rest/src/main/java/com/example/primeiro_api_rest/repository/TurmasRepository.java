package com.example.primeiro_api_rest.repository;

import com.example.primeiro_api_rest.entity.TurmasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TurmasRepository extends JpaRepository<TurmasEntity, Long> {
    Optional<TurmasEntity> findById(Long id);
}
