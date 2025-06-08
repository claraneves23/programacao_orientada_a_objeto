package atividade;

public class Cardio extends Atividade{

    @Override
    public void executarTreino(){
        System.out.println("Estou fazendo cardio");
    }

    @Override
    public double getDuracao(double duracao){
        return duracao + 1;
    }
}
