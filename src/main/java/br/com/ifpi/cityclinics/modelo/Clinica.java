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
 * Reúne os atributos necessários para as clínicas cadastradas.
 * @author Ruan Victor
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
	private String convenio;
	private String especialidade;
	private String exame;
	
	//Getters & Setters:
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendar getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(Calendar dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	public String getTelefoneClinica() {
		return telefoneClinica;
	}
	public void setTelefoneClinica(String telefoneClinica) {
		this.telefoneClinica = telefoneClinica;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	
}
