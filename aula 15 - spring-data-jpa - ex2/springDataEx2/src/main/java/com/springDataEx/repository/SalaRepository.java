package com.springDataEx.repository;

import com.springDataEx.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer> {

    Optional<Sala> findAllById(Integer id);
}
