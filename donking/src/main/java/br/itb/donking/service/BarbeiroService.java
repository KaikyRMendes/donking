package br.itb.donking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.itb.donking.entity.Barbeiro;
import br.itb.donking.repository.BarbeiroRepository;
import jakarta.transaction.Transactional;


@Service
public class BarbeiroService {

	// objeto repository
	@Autowired
	private BarbeiroRepository barbeiroRepository;

	
	// Método SELECT * FROM BARBEIRO
		public List<Barbeiro> buscarAllBarbeiros(){
			return barbeiroRepository.findAll();
		}
		
	// Insert into barbeiro...
		@Transactional
		public Barbeiro inserir(Barbeiro barbeiro) { 
			return barbeiroRepository.saveAndFlush(barbeiro);
		}
		
	// Alterar	
		public Barbeiro alterar(Barbeiro barbeiro) {
			return barbeiroRepository.saveAndFlush(barbeiro);
		}
		
	//Delete
		public void excluir(Long id) {
			Barbeiro barbeiro = barbeiroRepository.findById(id).get();
			barbeiroRepository.delete(barbeiro);
		}
}
