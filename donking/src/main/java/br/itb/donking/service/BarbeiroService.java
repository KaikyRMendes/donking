package br.itb.donking.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.itb.donking.model.Barbeiro;
import br.itb.donking.model.BarbeiroRepository;


@Service
public class BarbeiroService {

	// objeto repository
	final BarbeiroRepository barbeiroRepository;
	
	// Injeção de dependência
	public BarbeiroService(BarbeiroRepository _barbeiroRepository) {
		this.barbeiroRepository = _barbeiroRepository;
	}
	
	// Método SELECT * FROM PRODUTO
		public List<Barbeiro> findAll(){
			return barbeiroRepository.findAll();
		}
		
	// Insert into barbeiro...
		public Barbeiro save (Barbeiro barbeiro) {
			return barbeiroRepository.save(barbeiro);
		}
}
