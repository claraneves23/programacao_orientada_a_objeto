package material;

public class Papelaria {
	private String caderno;
	private String lápis;
	
	Papelaria(){
		System.out.println("acesso ao método construtor padrão da superclasse");
		
	}
	
	Papelaria (String lápis){
		this.lápis = lápis;
	}
	
	public void set_caderno(String caderno) {
		this.caderno = caderno;
	}
	
	public String get_caderno() {
		return caderno;
	}
	
	public String get_lápis() {
		return lápis;
	}
}
