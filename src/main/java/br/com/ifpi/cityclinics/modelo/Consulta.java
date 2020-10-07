package br.com.ifpi.cityclinics.modelo;

import java.util.Calendar;
/*
 * Reune os atribubtos necessários para as consultas cadastradas.
 * @author Ruan victor
 * @author Rian Soares
 * */
public class Consulta {
	private String convenio;
	private Calendar dataNascimento;
	private int idade;
	private String telefone;
	private String cpf;
	private Calendar dataConsulta;
	private String dadosClinicos;
	private boolean finalizada;
	
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Calendar getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getDadosClinicos() {
		return dadosClinicos;
	}
	public void setDadosClinicos(String dadosClinicos) {
		this.dadosClinicos = dadosClinicos;
	}
	public boolean isFinalizada() {
		return finalizada;
	}
	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	
	
}
