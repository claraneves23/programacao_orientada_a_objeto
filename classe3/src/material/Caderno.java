package material;

public class Caderno extends Material_Escolar {
	private String cor;
	private String capa;
	private int qtd_páginas;
	
	Caderno(){
		super();
	}
	
	public void set_cor(String cor) {
		this.cor = cor;
	}
	
	public String get_cor() {
		return cor;
	}
	
	public void set_capa(String capa) {
		this.capa = capa;
	}
	
	public String get_capa() {
		return capa;
	}
	
	public void set_qtd_páginas(int qtd_páginas) {
		this.qtd_páginas = qtd_páginas;
	}
	
	public int get_qtd_páginas() {
		return qtd_páginas;
	}
}
