package atividade;

public class Musculacao extends Atividade {

    @Override
    public void executarTreino(){
        System.out.println("Estou fazendo musculação");
    }

    @Override
    public double getDuracao(double duracao){
        return duracao + 2;
    }
}
