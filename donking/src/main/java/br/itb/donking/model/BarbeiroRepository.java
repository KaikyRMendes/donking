package br.itb.donking.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {

	
}