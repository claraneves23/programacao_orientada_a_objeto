package atividade;

public class Pilates extends Atividade{

    @Override
    public void executarTreino(){
        System.out.println("Estou fazendo Pilates");
    }

    @Override
    public double getDuracao(double duracao){
        return duracao + 3;
    }
}
