package br.itb.donking.model;

import java.text.DateFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Barbeiro")
public class Barbeiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	private String NOME;
	private String TELEFONE;
	private String EMAIL;
	private String SENHA;
	private DateFormat dataNasc;
	private String nivelAcesso;
	private byte[] FOTO;
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nOME) {
		NOME = nOME;
	}
	public String getTELEFONE() {
		return TELEFONE;
	}
	public void setTELEFONE(String tELEFONE) {
		TELEFONE = tELEFONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getSENHA() {
		return SENHA;
	}
	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}
	public DateFormat getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(DateFormat dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public byte[] getFOTO() {
		return FOTO;
	}
	public void setFOTO(byte[] fOTO) {
		FOTO = fOTO;
	}
	
	
}

