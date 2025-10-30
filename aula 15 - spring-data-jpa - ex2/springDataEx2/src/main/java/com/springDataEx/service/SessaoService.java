package com.springDataEx.service;

import com.springDataEx.model.Sessao;
import com.springDataEx.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    public List<Sessao> listarTodasSessoes(){
        return sessaoRepository.findAll();
    };

    public Optional<Sessao> buscarSessaoId(Integer id){
        return sessaoRepository.findAllById(id);
    }

    public Sessao salvarSessao(Sessao sessao){
        return sessaoRepository.save(sessao);
    }
}
