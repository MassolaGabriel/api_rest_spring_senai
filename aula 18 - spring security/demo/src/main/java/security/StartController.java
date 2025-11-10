package security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StartController {

	@GetMapping("/publico")
	public String publico() {
		return "rota publica";
	}
	
	@GetMapping("/privada")
	public String privada() {
		return "rota privada, necessario acesso";
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String administrador() {
		return "Rota privada, necessario acesso admin";
	}
	
}
