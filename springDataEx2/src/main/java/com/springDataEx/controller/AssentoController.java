package com.springDataEx.controller;

import com.springDataEx.model.Assento;
import com.springDataEx.service.AssentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/assentos")
public class AssentoController {

    @Autowired
    private AssentoService assentoService;

    @GetMapping
    public ResponseEntity<List<Assento>> listarTodosAssentos(){
        List<Assento> assentos = assentoService.listarTodosAssentos();

        if(assentos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(assentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Assento>> buscarAssentoPorId(@PathVariable("id") Integer id){
        Optional<Assento> assento = assentoService.buscarAssentoPorId(id);

        if (assento.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(assento);
    }

    @PostMapping
    public ResponseEntity<Assento> salvarNovoAssento(@RequestBody Assento assento) {
        Assento assentoSalvo = assentoService.salvarAssento(assento);
        return ResponseEntity.status(HttpStatus.CREATED).body(assentoSalvo);
    }
}
