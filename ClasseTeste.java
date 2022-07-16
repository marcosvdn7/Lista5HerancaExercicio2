package ListaOOB5Heran�aExercicio2;

import java.util.Scanner;

public class ClasseTeste {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		//Array criado para colocar os objetos professor cadastrados, para entao serem
		//usados como atributos para as classes Disciplina e Curso;
		Professor[] professores = new Professor[3];
		
		//Criado para receber o cadastra de um T�cnico Admnistrativo;
		TecnicoAdmnistrativo tecnico = new TecnicoAdmnistrativo();
		
		//Pra poupar tempo nos testes do programa e nao precisar cadastrar os cusos digitando,
		//ja consrui os objetos cursos e seus respectivos atributos;
		Curso curso1 = new Curso("EngenhariaDaComputa��o", "111111", "450");
		
		//Mesma logica dos cursos, ja criei os objetos programa para nao precisar fazer os
		//cadastros manualmente e poupar tempo nos testes. Tambem criei um array disciplinas
		//para receber as disciplinas criadas e usar como atributos para as classes Disciplina,
		//Curso e Professor;
		Disciplina disciplinaLogicaProgramacao = new Disciplina("LogicaPrograma��o", "1111", "180");
		Disciplina disciplinaCalculos = new Disciplina("Calculos", "2222", "150");
		Disciplina disciplinaBancoDeDados = new Disciplina("BancoDeDados", "3333", "140");
		Disciplina[] disciplinas = new Disciplina[3];
		disciplinas[0] = disciplinaLogicaProgramacao;
		disciplinas[1] = disciplinaCalculos;
		disciplinas[2] = disciplinaBancoDeDados;
		
		curso1.setDisciplinas(disciplinas);
		
		Curso curso2 = new Curso("AnaliseDeSistemas", "222222", "150");
		
		Disciplina disciplinaAlgoritmos = new Disciplina("Algoritmos", "1111", "180");
		Disciplina disciplinaMatematica = new Disciplina("Matematica", "2222", "150");
		Disciplina disciplinaAdmnistracao = new Disciplina("Admnistra��o", "3333", "140");
		disciplinas[0] = disciplinaAlgoritmos;
		disciplinas[1] = disciplinaMatematica;
		disciplinas[2] = disciplinaAdmnistracao;
		
		curso2.setDisciplinas(disciplinas);
		
		
		//Array curso criado para receber os objetos cursos criados acima;
		Curso[] cursos = new Curso[2];
		cursos[0] = curso1;
		cursos[1] = curso2;
		
		
		//Array alunos para receber os objetos alunos, que ser�o criados assim que a op��o
		//para cadastrar alunos for selecionada.
		Aluno[] alunos = new Aluno[3];
		
		
		//varieveis criadas para:(opcao)receber as op��es selecionadas nos menus.(nomeCurso)receber  
		//os nomes dos cursos cadastrados nos registros de Alunos e Professores.
		int opcao = 0;
		String nomeCurso;
		
		//Loop usado para repetir e simular todo os sitema da universidade, s� ir� encerrar ao mudar o
		//valor da variavel (opcao) para 8;
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
			
			
			//Caso o valor da variav�l (opcao) seja modificado para 1, entra no trecho do c�digo utilizado
			//para criar o objeto Aluno e cadastrar todos os seus atributos, assim como atribuir os 
			//objetos Aluno no array Alunos do Objeto Disciplina;
			if (opcao == 1) {
				Aluno aluno = new Aluno();
				
				System.out.println("Informe o nome do aluno: ");
				aluno.setNome(read.next());
				
				System.out.println("Informe o n�mero de matr�cula do aluno: ");
				aluno.setNumMatricula(read.next());
				
				System.out.println("Informe o CPF do aluno: ");
				aluno.setCpf(read.next());
				
				System.out.println("Informe o curso no qual o aluno est� matriculado: ");
				nomeCurso = read.next();
				
				//Loop usado para comparar o nome do curso cadastrado no atributo (nomeAluno)
				//do objeto Curso. Caso sejam iguais, o atributo (curso) do objeto Aluno ser�
				//igual ao atributo (nome) do objeto Curso dentro do indice (i) do array [cursos];
				for (int i = 0; i < cursos.length; i++) {
					if (nomeCurso.equalsIgnoreCase(cursos[i].getNome())) {
						aluno.setCurso(cursos[i].getNome());
						//Nesse loop, o objeto Disciplina dentro do array [disciplinas] ser� atribuido
						//ao atributo [disciplinas] do objeto Aluno, assim como o objeto Aluno ser� 
						//atribuito ao atributo [alunos] do objeto Disciplinas que est� no indice (j) 
						//do array [disciplinas];
						for (int j = 0; j < disciplinas.length; j++) {
							aluno.cadastrarDisciplinas(disciplinas);
							disciplinas[j].setAlunos(alunos);
						}
					}
				}
				
				//Loop usado para atribuir o objeto Aluno no �ndice (i) do array alunos, usado como 
				//atributo para os objetos Cursos e Disciplinas;
				for (int i = 0; i < cursos.length; i++) {
					if (alunos[i] == null) {
						alunos[i] = aluno;
						break;
					}
				}
				
			} 
			
			//Caso o valor da vari�vel (opcao) seja modificado para 2, entra para o trecho de c�digo
			//respons�vel pro cadastrar um professor, criando o objeto Professor e recebendo os valores
			//dos atributos da classe, assim como atribuindo o objeto professor ao array [professores],
			//usado como atributo nas classes Disciplina e Curso;
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
				
				System.out.println("Informe o sal�rio bruto do professor: ");
				professor.setSalario(read.nextDouble());
				
				System.out.println("Informe a titula��o do professor: ");
				professor.setTitulacao(read.next());
				
				System.out.println("Informe a �rea de pesquisa do professor: ");
				professor.setAreaPesquisa(read.next());
				
				System.out.println("Informe o curso ministrado pelo professor: ");
				nomeCurso = read.next();
				
				//Loop utilizado para atribuir o objeto curso dentro do indice (i) do
				//array [cursos] ao atributo (curso) do objeto Professor caso a vari�vel
				//(nomeCurso) seja igual ao atributo (nome) do objeto curso dentro do 
				//indice (i) do array [cursos]. Caso isso seja verdade, o rec�m criado
				//objeto Professor tamb�m sera atribuido para o indice (i) do array
				//[professores] e para o o atributo [professores] do objeto Professor
				//localizado no indice (i) do array [cursos].
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
				
				System.out.println("Informe o sal�rio bruto do tecnico: ");
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
