package localidades;

public class Municipio {
    protected String nome;
    protected double populacao;

    public Municipio(String nome, double populacao){
        this.nome = nome;
        this.populacao = populacao;
    }

    public void mostrarLocal() {
        System.out.println("Município: " + nome);
    }

}
