package com.springDataEx.service;

import com.springDataEx.model.Filme;
import com.springDataEx.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> listarTodosFilmes() {return filmeRepository.findAll();}

    public Optional<Filme> buscarFilmePorId(Integer id) {return filmeRepository.findById(id);}

    public Filme salvarFilme(Filme filme){return filmeRepository.save(filme);}
    
}
