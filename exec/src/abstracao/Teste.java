package abstracao;

public class Teste implements Metodos{

    @Override
    public int Soma(int a, int b) {
        return a + b;
    }

    @Override
    public String Palavra(String c) {
        return c;
    }
}
