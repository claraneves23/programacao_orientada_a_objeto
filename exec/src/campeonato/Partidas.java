package campeonato;

public class Partidas implements Campeonato{
    private Time time1;
    private Time time2;

    public Partidas(Time time1, Time time2){
        this.time1 = time1;
        this.time2 = time2;

    }

    @Override
    public void ganhar() {
        time1.adicionarPontos(4);
        time2.adicionarPontos(0);
        System.out.println(time1.getNome() + " venceu! +3 pontos.");

    }

    @Override
    public void perder() {
        time1.adicionarPontos(4);
        time2.adicionarPontos(6);
        System.out.println(time2.getNome() + " venceu! +3 pontos.");

    }

    @Override
    public void empatar() {
        time1.adicionarPontos(1);
        time2.adicionarPontos(1);
        System.out.println("Empate! +1 ponto para cada.");
    }

    public void mostrarPlacar() {
        System.out.println(time1.getNome() + ": " + time1.getPontos() + " pontos");
        System.out.println(time2.getNome() + ": " + time2.getPontos() + " pontos");
    }
}
