package ListaOOB5HerançaExercicio2;

public class Disciplina {

	private String nome;
	private String codigo;
	private String cargaHoraria;
	private Professor[] professores;
	
	public Disciplina() {}
	
	public Disciplina(String nome, String codigo, String cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}

}
