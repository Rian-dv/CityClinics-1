package br.com.ifpi.cityclinics.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
 * Classe principal do projeto.
 * Reune os atribubtos necessários para as clinicas cadastradas.
 * @author Ruan victor
 * @author Rian Soares
 * */
@Entity
public class Clinica { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeClinica;
	private String imagemClinica;
	private String horarioFuncionamento;
	private String endereco;
	@Temporal(TemporalType.DATE)
	private Calendar dataDeCadastro;
	private String telefoneClinica;
	private boolean aberta;
	
	//Getters & Setters/:
	
	public Calendar getDataDeCadastro() {
		return dataDeCadastro;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getTelefoneClinica() {
		return telefoneClinica;
	}

	public void setTelefoneClinica(String telefoneClinica) {
		this.telefoneClinica = telefoneClinica;
	}

	public void setDataDeCadastro(Calendar dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long Id) {
		id = Id;
	}

	public String getNome() {
		return nomeClinica;
	}

	public void setNome(String nome) {
		this.nomeClinica = nome;
	}

	public String getImagem() {
		return imagemClinica;
	}

	public void setImagem(String imagem) {
		this.imagemClinica = imagem;
	}
	
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}

	public String getImagemClinica() {
		return imagemClinica;
	}

	public void setImagemClinica(String imagemClinica) {
		this.imagemClinica = imagemClinica;
	}

}
