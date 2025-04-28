package mtd_destrutor;

public class Automovel {
    private String marca;
    private String modelo;
    private String cor;
    private double preço;

    Automovel(String marca, String modelo, String cor, double preço){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preço = preço;

    }

    String dados;

    public String mostra_Automovel(){

        dados = "Marca:\t" + marca + "\n" + "Modelo:\t" + modelo + "\n" + "Cor:\t" + cor + "\n" + "Preço R$" + preço;
        return dados;

    }
}
