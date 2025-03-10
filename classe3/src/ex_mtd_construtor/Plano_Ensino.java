package ex_mtd_construtor;

public class Plano_Ensino {
	private String matéria;
	private String conteúdo_pragmático;
	private String critério_avaliação;
	private String bibliografia;
	
	Plano_Ensino(){} //versão padrão
	Plano_Ensino(String matéria, String conteúdo_pragmático, String critério_avaliação, String bibliografia){
		this.matéria = matéria;
		this.conteúdo_pragmático = conteúdo_pragmático;
		this.critério_avaliação = critério_avaliação;
		this.bibliografia = bibliografia;
	}
	
	public void set_matéria(String matéria) {
		this.matéria = matéria;
	}
	public void set_conteúdo_pragmático(String conteúdo_pragmático) {
		this.conteúdo_pragmático = conteúdo_pragmático;
	}
	public void set_critério_avaliação(String critério_avaliação) {
		this.critério_avaliação = critério_avaliação;
	}
	public void set_bibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public String get_matéria() {
		return matéria;
	}
	
	public String get_conteúdo_pragmático() {
		return conteúdo_pragmático;
	}
	
	public String get_critério_avaliação() {
		return critério_avaliação;
	}
	
	public String get_bibliografia() {
		return bibliografia;
	}

}
