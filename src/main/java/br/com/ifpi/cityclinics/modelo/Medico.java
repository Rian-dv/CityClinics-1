package br.com.ifpi.cityclinics.modelo;
/*
 * Reúne os atributos necessários para os médicos cadastrados.
 * @author Ruan Victor
 * @author Rian Soares
 * */
public class Medico {
	 
	 private String nomeMedico;
	 private String imagemMedico;
	 private String categoriaMedico;
	 private String horarioMedico;
	 
	 public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getImagemMedico() {
		return imagemMedico;
	}
	public void setImagemMedico(String imagemMedico) {
		this.imagemMedico = imagemMedico;
	}
	public String getCategoriaMedico() {
		return categoriaMedico;
	}
	public void setCategoriaMedico(String categoriaMedico) {
		this.categoriaMedico = categoriaMedico;
	}
	public String getHorarioMedico() {
		return horarioMedico;
	}
	public void setHorarioMedico(String horarioMedico) {
		this.horarioMedico = horarioMedico;
	}
	 
}
