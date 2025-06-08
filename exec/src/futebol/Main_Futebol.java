package futebol;

public class Main_Futebol {
    public static void  main(String Args[]){

        TimeAmador timeAmador = new TimeAmador();
        timeAmador.treinar();
        System.out.println("O time amador está jogando hoje? " + timeAmador.jogarPartida(false));

        TimeSerieC timeSerieC = new TimeSerieC();
        timeSerieC.treinar();
        System.out.println("O time da série C está jogando hoje? " + timeSerieC.jogarPartida(false));
    }
}
