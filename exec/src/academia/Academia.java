package academia;

public abstract class Academia {
    private String nome;

    public abstract void fazerMatricula ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Academia(String nome){
        System.out.println("Venha conhecer a academia " + nome);
    }



}
