package br.com.amanda.academico.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudante")
public class EstudanteControlador {
	
	@GetMapping
	public ResponseEntity<String> aloMundo(){
		
		return ResponseEntity.ok("Olá, mundo!");
	}

}
