package atividade;

public class Main_Atividade {
    public static void main (String Args[]){

        Musculacao musculacao = new Musculacao();
        musculacao.executarTreino();
        System.out.println("A duração do treino de musculação é de: " + musculacao.getDuracao(1));

        Cardio cardio = new Cardio();
        cardio.executarTreino();
        System.out.println("A duração do treino de cardio é de: " + cardio.getDuracao(1));

        Pilates pilates = new Pilates();
        pilates.executarTreino();
        System.out.println("A duração do treino de pilates é de: " + pilates.getDuracao(1));


    }
}
