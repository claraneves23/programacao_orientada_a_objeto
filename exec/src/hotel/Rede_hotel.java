package hotel;

public abstract class Rede_hotel {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void ExibirMensagem ();

    public Rede_hotel(String nome){
        this.nome = nome;
        System.out.println("Bem-vindo a Rede " + nome + " de hotéis");
    };


}
