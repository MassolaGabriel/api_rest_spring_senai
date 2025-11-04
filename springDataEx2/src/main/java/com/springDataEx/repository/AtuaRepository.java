package com.springDataEx.repository;

import com.springDataEx.model.Atua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtuaRepository extends JpaRepository<Atua, Long> {
}
