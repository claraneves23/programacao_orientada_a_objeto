package sobrecarga;

public class Ficha_funcionario {

    private String nome;
    private int idade;
    private String profissao;
    private double salario;

    Ficha_funcionario e;

    public Ficha_funcionario(String nome, String profissao, int idade, double salario ) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.profissao = profissao;
    }

    public Ficha_funcionario(int idade, double salario, String nome, String profissao ) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.profissao = profissao;
    }

    Ficha_funcionario(Ficha_funcionario e){
        this.e = e;
        mostra_funcionarios(e);
    }

    public void mostra_funcionarios(Ficha_funcionario f){
        System.out.println("Nome: " + f.nome + "\nIdade " + f.idade + "\nProfissão " + f.profissao + "\nSalário " + f.salario);
    }

    public String mostra_funcionarios(){
        return ("Nome: " + nome + "\nIdade " + idade + "\nProfissão " + profissao + "\nSalário " + salario);
    }
}
