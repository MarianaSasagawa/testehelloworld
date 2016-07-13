public class AlunoUniversitario extends Aluno{
	
	private String curso;
	private boolean bolsista;
	
	public AlunoUniversitario(String nome, int idade, String matricula, 
								char sexo, String curso, boolean bolsista){
		super(nome, idade, matricula, sexo);
		this.curso = curso;
		this.bolsista = bolsista;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean getBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	
	public String toString(){
		return super.toString()
				+"Curso: "+this.curso
				+"\nBolsista: "+ (this.bolsista? "Sim": "Não");
	}

	public void imprimir(){
		System.out.println(this);
	}
}
