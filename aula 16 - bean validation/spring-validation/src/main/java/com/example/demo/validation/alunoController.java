package com.example.demo.validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class alunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping
	public List<Aluno> listar(){
		return alunoRepository.findAll();
	}
	
	@PostMapping
	public Aluno cadastrar(@Valid @RequestBody Aluno novoAluno) {
		return alunoRepository.save(novoAluno);
	}
}
