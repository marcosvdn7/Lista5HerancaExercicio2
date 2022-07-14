package ListaOOB5HerançaExercicio2;

public abstract class Funcionario {

	private String nome;
	private String telefone;
	private String cpf;
	private String ctps;
	private double salario;
	
	public Funcionario() {}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public String getCtps() {
		return ctps;
	}
	
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double calcSalario();
}
