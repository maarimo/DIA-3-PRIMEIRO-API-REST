package com.example.primeiro_api_rest.repository;

import com.example.primeiro_api_rest.entity.TurmasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmasRepository extends JpaRepository<TurmasEntity, Long> {
}
