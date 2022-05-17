package com.example.demo.tacos.data;

import com.example.demo.tacos.web.api.Taco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TacoRepository extends JpaRepository<Taco, Long> {
    Optional<Taco> findById(Long id);
}