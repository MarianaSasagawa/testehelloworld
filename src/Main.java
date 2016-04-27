import java.util.Scanner;

public class Main {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("Prova de Programação Orientado à Objetos");
		System.out.println("-------------------------------");
		
		do{
			System.out.println("\n-------------------------------");
			System.out.println("Insira 1 para Resposta da Pergunta 1");
			System.out.println("Insira 2 para Teste de Ponto 2D");
			System.out.println("Insira 3 para Matriz");
			System.out.println("Insira 4 para Vogais");
			System.out.println("Insira 5 para Adicionar um Aluno");
			System.out.println("Insira 0 para Sair");
		
			int opcao = scan.nextInt();
			scan.nextLine();
			
			switch (opcao) {
				case 0:
					System.out.println("Saindo...");
					System.exit(0);
				case 1:
					Main.resposta1();
					break;
				case 2:
					Main.testePonto2D();
					break;
				case 3:
					Main.testeMatriz();
					break;
				case 4:
					Main.testeVogais();
					break;
				case 5:
					Main.testeAlunoUniversitario();
					break;
				
				default:
					System.out.println("Opï¿½ï¿½o invï¿½lida!!!");
					break;
			}
			
			System.out.println("\n\n\n\n");
		}while(true);
	}
	
	public static void resposta1(){
		System.out.println("-------------------------------");
		System.out.println("Resposta da Questï¿½o 1");
		System.out.println("-------------------------------");
		System.out.println("Super ï¿½ utilizado para acessar mï¿½todos e variï¿½veis de uma classe Pai");
		System.out.println("New ï¿½ utilizado para instanciar um objeto e torna-lo acessï¿½vel");
	}
	
	static public void testePonto2D(){
		
		int x, y;
		Ponto2D A, B, C;
		System.out.println("-------------------------------");
		System.out.println("Teste Ponto 2D");
		System.out.println("-------------------------------");
		
		System.out.println("Insira as Coordenadas do Ponto A, separado por um espaï¿½o: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		A = new Ponto2D(x, y);
		
		System.out.println("Insira as Coordenadas do Ponto B, separado por um espaï¿½o: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		B = new Ponto2D(x, y);
		C = B.criarRevertido();
		
		System.out.println("-------------------------------");
		System.out.println("A: "+A);
		System.out.println("B: "+B);
		System.out.println("C: "+C);
		
		
	}
	
	static public void testeMatriz(){
		int x, y;
		
		System.out.println("-------------------------------");
		System.out.println("Matriz Identidade");
		System.out.println("-------------------------------");
		
		do{
			System.out.println("Insira o Nï¿½mero de Colunas e Linhas, separado por um espaï¿½o: ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(x == y){
				break;
			}
			
			System.out.println("Insira o Numero de Colunas e Linhas devem ser iguais!");
		}while(true);
		
		System.out.println("\nGerando Matriz Identidade...\n");
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		
		
	}
	
	static public void testeAlunoUniversitario(){
		String nome, matricula, curso;
		int idade = 0;
		char sexo = 'A';
		boolean bolsista;
		char auxBolsista;
		
		System.out.println("-------------------------------");
		System.out.println("Cadastro de Aluno Universitï¿½rio");
		System.out.println("-------------------------------");
		System.out.println();
		
		do{
			System.out.print("Nome: ");
			nome = scan.nextLine();
			scan.reset();
		}while(nome.length() < 3);
		
		do{
			System.out.print("Idade: ");
			idade = scan.nextInt();
			scan.nextLine();
		}while(idade <= 0);
		
		
		do{
			System.out.print("Matricula: ");
			matricula = scan.nextLine();
		}while(matricula.length() < 3);
		
		do{
			System.out.print("Sexo(M ou F):");
			sexo = scan.next().toUpperCase().trim().charAt(0);
			scan.nextLine();
		}while(sexo != 'M' && sexo != 'F');
		
		
		do{
			System.out.print("Curso: ");
			curso = scan.nextLine();
		}while(curso.length() < 3);
		
		do{
			System.out.print("Bolsista(S ou N): ");
			auxBolsista = scan.next().toUpperCase().trim().charAt(0);
			scan.nextLine();
		}while(auxBolsista != 'S' && auxBolsista != 'N');
		
		bolsista = (auxBolsista == 'S'? true: (auxBolsista == 'N'? false :null));

		System.out.println("\n\n-------------------------");
		AlunoUniversitario aluno = new AlunoUniversitario(
				nome, idade, matricula, sexo, curso, bolsista);
		System.out.println("Aluno Cadastrado com sucesso");
		System.out.println("\n\n-------------------------");
		System.out.println(aluno.toString());
	}
	
	static public void testeVogais(){
		String frase;
		System.out.println("-------------------------------");
		System.out.println("Vogais");
		System.out.println("-------------------------------");
		System.out.println("Escreva uma frase:");
		frase = scan.nextLine();
		
		System.out.println(frase.replaceAll("[aeiouAEIOU]", "?"));
		
		
	}

}
