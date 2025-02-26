package mtd_construtor;

public class Automovel {
	private int ano;
	String modelo;
	String marca;
	private static String cor;
	double preco;
	
	Automovel(){}
	
	Automovel(int ano, String marca, String modelo, double preco){
		this.ano= ano;
		this.modelo = modelo;
		this.marca = marca;
		this.preco = preco;		
	}
	
	static {
		cor = "verde";
	}
  public void mostracarro()
  {
	  System.out.println("\n carro marca:\t" + marca + "\n modelo:\t"+ modelo + "\n ano:\t" + ano + "\n cor:\t" + cor + "\n preco:\t" + preco);
  }
}
