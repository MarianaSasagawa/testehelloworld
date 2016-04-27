
public abstract class Aluno {
	
	private String nome;
	private int idade;
	private String matricula;
	private char sexo;
	
	public Aluno(String nome, int idade, String matricula, char sexo){
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.sexo = sexo;
	}
	
	public String toString(){
		return "Nome: "+this.nome+"\n"
			   +"Idade: "+this.idade+"\n"
			   +"Sexo: " +(this.sexo == 'M'? "Masculino": "Feminino")+"\n"
			   +"Matricula: "+this.matricula+"\n";
	}
	
	
}
