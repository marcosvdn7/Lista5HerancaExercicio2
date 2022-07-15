package Lista5HerancaExercicio2;

public class Curso {
	
	private String nome;
	private String codigo;
	private String duracaoHoras;
	private Professor[] professores;
	private Disciplina[] disciplinas;
	
	
	public Curso() {
	}
	
	public Curso(String nome, String codigo, String duracaoHoras) {
		this.nome = nome;
		this.codigo = codigo;
		this.duracaoHoras = duracaoHoras;
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
	
	public String getDuracaoHoras() {
		return duracaoHoras;
	}
	
	public void setDuracaoHoras(String duracao) {
		this.duracaoHoras = duracao;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}

	public void mostrarProfessores() {
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
