package secretaria;

public class Secretaria_Escolar {

	//atributos
	private String nome_aluno;
	private String curso_aluno;
	private String matricula_aluno;
	private int idade_aluno;
	private double media_aluno;
	
	//método construtor
	public Secretaria_Escolar() {}
	
	//método construtor
	public Secretaria_Escolar(String nome_aluno,int idade_aluno, double media_aluno, String curso_aluno) {
		this.nome_aluno = nome_aluno;
		this.idade_aluno = idade_aluno;
		this.media_aluno = media_aluno;
		this.curso_aluno = curso_aluno;
	}
	
	//métodos get()
	public String getNomeAluno() {
		return nome_aluno;
	}
	
	public int getIdadeAluno() {
		return idade_aluno;
	}
	
	public double getMediaAluno() {
		return media_aluno;
	}
	
	public String getCursoAluno() {
		return curso_aluno;
	}
	
	//métodos set()
	
	public void setMatriculaAluno(String matricula_aluno) {
		this.matricula_aluno = matricula_aluno;
	}
	
	public String getMatriculaAluno() {
		return matricula_aluno;
	}
}
