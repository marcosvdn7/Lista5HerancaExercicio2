package Lista5HerancaExercicio2;

import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Professor[] professores = new Professor[3];
		
		TecnicoAdmnistrativo tecnico = new TecnicoAdmnistrativo();
		
		Curso curso1 = new Curso("EngenhariaDaComputação", "111111", "450");
		
		Disciplina disciplina1 = new Disciplina("LogicaProgramação", "1111", "180");
		Disciplina disciplina2 = new Disciplina("Calculos", "2222", "150");
		Disciplina disciplina3 = new Disciplina("BancoDeDados", "3333", "140");
		Disciplina[] disciplinas = new Disciplina[3];
		disciplinas[0] = disciplina1;
		disciplinas[1] = disciplina2;
		disciplinas[2] = disciplina3;
		
		curso1.setDisciplinas(disciplinas);
		
		Curso curso2 = new Curso("AnaliseDeSistemas", "222222", "150");
		
		Disciplina disciplina4 = new Disciplina("Algoritmos", "1111", "180");
		Disciplina disciplina5 = new Disciplina("Matematica", "2222", "150");
		Disciplina disciplina6 = new Disciplina("Admnistração", "3333", "140");
		disciplinas[0] = disciplina4;
		disciplinas[1] = disciplina5;
		disciplinas[2] = disciplina6;
		
		curso2.setDisciplinas(disciplinas);
		
		Curso[] cursos = new Curso[2];
		cursos[0] = curso1;
		cursos[1] = curso2;
		
		Aluno[] alunos = new Aluno[3];
		
		int opcao = 0;
		String nomeCurso;
//		String disciplina;
		
		while (opcao != 8) {
			System.out.println("----------------Universidade----------------");
			System.out.println("--------------------------------------------");
			System.out.println("1 - Registrar Aluno.");
			System.out.println("2 - Registrar Professor.");
			System.out.println("3 - Registrar Tecnico Admnistrativo.");
			System.out.println("4 - Verificar Ficha Aluno.");
			System.out.println("5 - Verificar Ficha Curso.");
			System.out.println("6 - Verificar Ficha Professor.");
			System.out.println("7 - Verificar Ficha Tecnico Admnistrativo.");
			System.out.println("8 - Encerrar.");
			System.out.println("--------------------------------------------");
			opcao = read.nextInt();
			
			if (opcao == 1) {
				Aluno aluno = new Aluno();
				
				System.out.println("Informe o nome do aluno: ");
				aluno.setNome(read.next());
				
				System.out.println("Informe o número de matrícula do aluno: ");
				aluno.setNumMatricula(read.next());
				
				System.out.println("Informe o CPF do aluno: ");
				aluno.setCpf(read.next());
				
				System.out.println("Informe o curso no qual o aluno está matriculado: ");
				nomeCurso = read.next();
				
				for (int i = 0; i < cursos.length; i++) {
					if (nomeCurso.equalsIgnoreCase(cursos[i].getNome())) {
						aluno.setCurso(cursos[i].getNome());
						for (int j = 0; j < disciplinas.length; j++) {
							aluno.cadastrarDisciplinas(disciplinas);;
						}
					}
				}
				
				for (int i = 0; i < cursos.length; i++) {
					if (alunos[i] == null) {
						alunos[i] = aluno;
						break;
					}
				}
				
			} 
			
			if (opcao == 2) {
				Professor professor = new Professor();
				
				System.out.println("Informe o nome do professor: ");
				professor.setNome(read.next());
				
				System.out.println("Informe o CPF do professor: ");
				professor.setCpf(read.next());
				
				System.out.println("Informe o telefone do professor: ");
				professor.setTelefone(read.next());
				
				System.out.println("Informe o CTPS do professor: ");
				professor.setTelefone(read.next());
				
				System.out.println("Informe o salário bruto do professor: ");
				professor.setSalario(read.nextDouble());
				
				System.out.println("Informe a titulação do professor: ");
				professor.setTitulacao(read.next());
				
				System.out.println("Informe a área de pesquisa do professor: ");
				professor.setAreaPesquisa(read.next());
				
				System.out.println("Informe o curso ministrado pelo professor: ");
				nomeCurso = read.next();
				
				for (int i = 0; i < cursos.length; i++) {
					if (nomeCurso.equalsIgnoreCase(cursos[i].getNome())) {
						professor.setCurso(cursos[i]);
						professores[i] = (professores[i] == null ? professor : null);
						cursos[i].setProfessores(professores);
					}
				}
				System.out.println(cursos[0].getProfessores());
				System.out.println(professor.getCurso().getNome());
				
			} else if (opcao == 3) {
				System.out.println("Informe o nome do tecnico: ");
				tecnico.setNome(read.next());
				
				System.out.println("Informe o CPF do tecnico: ");
				tecnico.setCpf(read.next());
				
				System.out.println("Informe o telefone do tecnico: ");
				tecnico.setTelefone(read.next());
				
				System.out.println("Informe o CTPS do tecnico: ");
				tecnico.setTelefone(read.next());
				
				System.out.println("Informe o salário bruto do tecnico: ");
				tecnico.setSalario(read.nextDouble());
				
				System.out.println("Informe o cargo do tecnico: ");
				tecnico.setCargo(read.next());
				
				System.out.println("Informe o departamento do tecnico: ");
				tecnico.setDepartamento(read.next());			
			} else if (opcao == 4) {
				int opcaoMenu = 0;
				System.out.println("Selecione o aluno: ");
				for (int i = 0; i < alunos.length; i++) {
					if (alunos[i] != null) {
						System.out.println((i + 1)+ " - " +alunos[i].getNome());
					}
				}
				opcaoMenu = read.nextInt();
				alunos[opcaoMenu - 1].mostrarAluno();
			}
		}
		
		read.close();
		
	}
}
