package futebol;

public class TimeAmador implements Time{
    @Override
    public void treinar() {
        System.out.println("O time amador está treinando");
    }

    @Override
    public boolean jogarPartida(boolean folga) {
        return folga;
    }
}
