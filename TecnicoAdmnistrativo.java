package ListaOOB5HerançaExercicio2;

public class TecnicoAdmnistrativo extends Funcionario {

	private String cargo;
	private String departamento;
	private double auxTransporte;
	private double auxAlimentacao;
	
	public TecnicoAdmnistrativo() {}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double calcSalario() {
		return super.getSalario() + this.auxAlimentacao + this.auxTransporte;
	}
	
	public double calcSalario(double horasTrabalhadas, double valorHora) {
		return super.getSalario() + this.auxTransporte + this.auxAlimentacao + (horasTrabalhadas + valorHora);
	}
	
}
