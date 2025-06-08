package futebol;

public class TimeSerieC implements Time {
    @Override
    public void treinar() {
        System.out.println("O time da série C está treinando");
    }

    @Override
    public boolean jogarPartida(boolean folga) {
        return !folga ;
    }
}
