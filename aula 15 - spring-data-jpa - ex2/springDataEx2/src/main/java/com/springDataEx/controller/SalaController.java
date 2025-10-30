package com.springDataEx.controller;

import com.springDataEx.model.Sala;
import com.springDataEx.service.SalaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public ResponseEntity<List<Sala>> listarTodasSalas(){
        List<Sala>salas = salaService.listarTodasSalas();

        if (salas.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(salas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Sala>> buscarPorId(@PathVariable("id") Integer id){
        Optional<Sala>sala = salaService.buscarPorId(id);

        if(sala.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sala);
    }
}
