
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
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
