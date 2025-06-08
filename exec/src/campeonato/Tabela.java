package campeonato;

public class Tabela {
    public static void main(String[] args) {
        Time t1 = new Time("Corinthians");
        Time t2 = new Time("Corinthians");

        Partidas jogo = new Partidas(t1, t2);

        jogo.ganhar();
        jogo.empatar();
        jogo.perder();

        jogo.mostrarPlacar();
    }
}
