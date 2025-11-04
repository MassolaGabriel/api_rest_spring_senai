package com.springDataEx.controller;

import com.springDataEx.model.Filme;
import com.springDataEx.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<Filme>> listarTodosFilmes(){
        List<Filme> filmes = filmeService.listarTodosFilmes();

        if (filmes.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filmes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Filme>> buscarFilmePorId(@PathVariable("id") Integer id){
        Optional<Filme> filme = filmeService.buscarFilmePorId(id);

        if (filme.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filme);
    }

    @PostMapping("/new")
    public ResponseEntity<Filme> salvarNovoFilme(@RequestBody Filme filme){
        Filme filmeSalvo = filmeService.salvarFilme(filme);

        return ResponseEntity.status(HttpStatus.CREATED).body(filmeSalvo);
    }
}
