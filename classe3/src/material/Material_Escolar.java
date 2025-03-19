package material;

public class Material_Escolar extends Papelaria {
	private double preço_caderno;
	private int quantidade_caixas_lápis;
	
	Material_Escolar(){
		super();
	}
	
	Material_Escolar(double preço_caderno, int quantidade_caixas_lápis){
		this.preço_caderno = preço_caderno;
		this.quantidade_caixas_lápis = quantidade_caixas_lápis;
	}
	
	public double get_preço_caderno() {
		return preço_caderno;
	}
	
	public int get_quantidade_caixas_lápis() {
		return quantidade_caixas_lápis;
	}
}
