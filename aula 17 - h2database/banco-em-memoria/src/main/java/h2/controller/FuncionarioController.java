package h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import h2.model.Funcionario;
import h2.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping
	public List<Funcionario> listar(){
		return funcionarioRepository.findAll();
	}
	
	@PostMapping
	public Funcionario cadastrar(@RequestBody Funcionario novoFuncionario) {
		return funcionarioRepository.save(novoFuncionario);
	}
}
