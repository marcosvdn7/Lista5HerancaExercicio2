package Lista5HerancaExercicio2;

public class Professor extends Funcionario{

	private String titulacao;
	private String areaPesquisa;
	private Disciplina[] disciplinas;
	private Curso curso;
	
	public Professor() {
		this.disciplinas = new Disciplina[3];
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String getAreaPesquisa() {
		return areaPesquisa;
	}
	
	public void setAreaPesquisa(String areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}
	
	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double calcSalario(double valorDedicacaoExclusiva, double retribTitulacao) {
		return super.getSalario() + valorDedicacaoExclusiva + retribTitulacao;
	}

	public double calcSalario() {
		return 0;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
