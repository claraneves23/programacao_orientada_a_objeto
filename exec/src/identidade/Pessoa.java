package identidade;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
