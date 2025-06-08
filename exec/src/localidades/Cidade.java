package localidades;

public class Cidade extends Municipio{

    public Cidade(String nome, double populacao){
        super(nome, populacao);
    }

    @Override
    public void mostrarLocal() {
        System.out.println("Cidade: " + nome);
    }
}
