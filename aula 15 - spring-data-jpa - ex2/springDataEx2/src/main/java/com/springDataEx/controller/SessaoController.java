package com.springDataEx.controller;

import com.springDataEx.model.Sessao;
import com.springDataEx.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/sessoes")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public ResponseEntity<List<Sessao>> listarTodasSessoes(){
        List<Sessao>sessoes = sessaoService.listarTodasSessoes();

        if(sessoes.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sessoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Sessao>> buscarPorId(@PathVariable("id") Integer id){
      Optional<Sessao> sessao = sessaoService.buscarSessaoId(id);

      if (sessao.isEmpty()){
          return ResponseEntity.notFound().build();
      }
      return ResponseEntity.ok(sessao);
    };

}
