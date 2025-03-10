package mtd_destrutor;

public class Automóvel {
	private String marca;
	private String modelo;
	private String cor;
	private double preço;
	
Automóvel(String marca, String modelo, String cor, double preço){
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
	this.preço = preço;
		
}

String dados;

public String mostra_Automóvel(){
	
	dados = "Marca:\t" + marca + "\n" + "Modelo:\t" + modelo + "\n" + "Cor:\t" + cor + "\n" + "Preço R$" + preço;
	return dados;
	
}
}


