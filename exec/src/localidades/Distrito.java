package localidades;

public class Distrito extends Municipio{

    public Distrito(String nome, double populacao){
        super(nome,populacao);
    }

    @Override
    public void mostrarLocal() {
        System.out.println("Distrito: " + nome);
    }
}
