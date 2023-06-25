package br.itb.donking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.donking.entity.Barbeiro;
import br.itb.donking.service.BarbeiroService;
import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/barbeiro")
public class BarbeiroController {
	
	// Injeção de depenencias
	@Autowired
	private BarbeiroService barbeiroService;
	
	// GET
	@GetMapping
	public List<Barbeiro> buscarAllBarbeiros(){
		return barbeiroService.buscarAllBarbeiros();
	}
	
	// POST
	@PostMapping
	public Barbeiro inserir(@RequestBody Barbeiro barbeiro) {
		return barbeiroService.inserir(barbeiro);
	}
	
	// PUT
		@PutMapping
		public Barbeiro alterar(@RequestBody Barbeiro barbeiro) {
			return barbeiroService.alterar(barbeiro);
		}
		
	// DELETE
		@DeleteMapping("/{id}")
		public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
			barbeiroService.excluir(id);
			return ResponseEntity.ok().build();
		}
	
}
	/* @Autowired
	    private BarbeiroRepository repository;
	 
	// GET
	@GetMapping
	 public ResponseEntity getAllBarbeiros(){
        var allBarbeiros = repository.findAll();
        return ResponseEntity.ok(allBarbeiros);
	}*/
	
	// POST
	/*''@PostMapping
	
	public ResponseEntity<Object> saveBarbeiro(@RequestBody Barbeiro barbeiro) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(barbeiroService.save(barbeiro));
	}
	
	// PUT
	@PutMapping
	public Barbeiro alterar(Barbeiro barbeiro) {
		return barbeiroService.alterar(barbeiro);
	}*/
	


