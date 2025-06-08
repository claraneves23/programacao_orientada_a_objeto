package localidades;

public class Bairro extends Municipio{

    public Bairro(String nome, double populacao){
        super(nome,populacao);
    }

    @Override
    public void mostrarLocal() {
        System.out.println("Bairro: " + nome);
    }
}
