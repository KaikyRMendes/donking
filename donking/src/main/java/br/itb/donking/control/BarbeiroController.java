package br.itb.donking.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.donking.model.Barbeiro;
import br.itb.donking.service.BarbeiroService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/barbeiro")
public class BarbeiroController {
	
	final BarbeiroService barbeiroService;
	
	// Injeção de depenencias
	public BarbeiroController(BarbeiroService _barbeiroService) {
		this.barbeiroService = _barbeiroService;
	}
	
	// GET
	@GetMapping
	public ResponseEntity<List<Barbeiro>> getAllBarbeiros() {
		return ResponseEntity.status(HttpStatus.OK)
				.body(barbeiroService.findAll());
	}
	
	// POST
	@PostMapping
	public ResponseEntity<Object> saveBarbeiro(Barbeiro barbeiro) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(barbeiroService.save(barbeiro));
	}
	
	

}
