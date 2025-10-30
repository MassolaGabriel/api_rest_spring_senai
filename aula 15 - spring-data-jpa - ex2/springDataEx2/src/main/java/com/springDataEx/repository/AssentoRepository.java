package com.springDataEx.repository;

import com.springDataEx.model.Assento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssentoRepository extends JpaRepository<Assento,Integer> {

    Optional<Assento> findAllById(Integer id);
}
