package com.springDataEx.repository;

import com.springDataEx.model.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Integer> {
    List<Sessao> findByFilmeTituloFilme(String titulo);
}
