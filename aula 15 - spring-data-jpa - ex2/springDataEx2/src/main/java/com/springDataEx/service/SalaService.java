package com.springDataEx.service;

import com.springDataEx.model.Sala;
import com.springDataEx.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public List<Sala>listarTodasSalas(){
        return salaRepository.findAll();
    };

    public Optional<Sala> buscarPorId(Integer id){
        return salaRepository.findAllById(id);
    }

    public Sala salvarSala(Sala sala){
        return salaRepository.save(sala);
    }
}
