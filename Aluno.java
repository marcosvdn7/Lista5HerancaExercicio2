package ListaOOB5HerançaExercicio2;

public class Aluno {

	private String nome;
	private String cpf;
	private String numMatricula;
	private String curso;
	private Disciplina[] disciplinas;
	
	public Aluno() {
		this.disciplinas = new Disciplina[3];
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNumMatricula() {
		return numMatricula;
	}
	
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] alunos) {
		this.disciplinas = alunos;
	}
	
	private void mostrarDisciplinas() {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println(disciplinas[i].getNome());
		}
	}
	
	public void mostrarAluno() {
		System.out.println("--------------------------------------------");
		System.out.println("Nome: " +this.nome);
		System.out.println("CPF: " +this.cpf);
		System.out.println("Número de matrícula: " +this.numMatricula);
		System.out.println("Curso: " +this.curso);
		System.out.println("Disciplinas: ");
		this.mostrarDisciplinas();
		System.out.println("--------------------------------------------");
	}
	
	public void cadastrarDisciplinas(Disciplina[] disciplinas) {
		for (int i = 0; i < disciplinas.length; i++) {
			this.disciplinas[i] = disciplinas[i];
		}
	}
}
