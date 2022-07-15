package Lista5HerancaExercicio2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Disciplina disciplina = new Disciplina();
		
		Professor[] professores = new Professor[3];
		
		for (int i = 0; i < professores.length; i++) {
			Professor professor = new Professor();
			
			System.out.println("Informe o nome: ");
			professor.setNome(read.next());
			
//			System.out.println("Informe o CPF: ");
//			professor.setCpf(read.next());
//			
//			System.out.println("Informe o CTPS: ");
//			professor.setCtps(read.next());
//			
//			System.out.println("Informe o telefone: ");
//			professor.setTelefone(read.next());
//			
//			System.out.println("Informe o salario: ");
//			professor.setSalario(read.nextDouble());
//			
//			System.out.println("Informe a titulação: ");
//			professor.setTitulacao(read.next());
//			
//			System.out.println("Informe a area de pesquisa: ");
//			professor.setAreaPesquisa(read.next());
			
			for (int j = 0; j < professores.length; j++) {
				if (professores[i] == null) {
					professores[i] = professor;
				}
			}
		}
		
		for (int i = 0; i < professores.length; i++) {
			System.out.println(professores[i].getNome());
		}
	}

}
