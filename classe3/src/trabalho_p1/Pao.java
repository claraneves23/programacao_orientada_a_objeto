package trabalho_p1;

public class Pao extends Padaria{
	
	String tipo;
	double vl_unit;
	
	Pao(String tipo, double vl_unit){
		super();
		this.tipo = tipo;
		this.vl_unit = vl_unit;
		System.out.println("O pão produzido é do tipo " + this.getTipo() + "e custa " +this.getValor());
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setValor(double vl_unit ) {
		this.vl_unit = vl_unit;
	}
	
	public double getValor() {
		return vl_unit;
	}
}
