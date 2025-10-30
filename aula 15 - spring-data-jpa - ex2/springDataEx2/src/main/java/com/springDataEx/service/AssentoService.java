package com.springDataEx.service;

import com.springDataEx.model.Assento;
import com.springDataEx.repository.AssentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssentoService {

    @Autowired
    private AssentoRepository assentoRepository;

    public List<Assento> listarTodosAssentos(){
        return assentoRepository.findAll();
    }

    public Optional<Assento> buscarAssentoPorId(Integer id){
      return assentoRepository.findAllById(id);
    };

    public Assento salvarAssento(Assento assento){
        return assentoRepository.save(assento);
    }
}
