package campeonato;

public class Time {
        private String nome;
        private int pontos;

        public Time(String nome) {
            this.nome = nome;
            this.pontos = 0;
        }

        public String getNome() {
            return nome;
        }

        public int getPontos() {
            return pontos;
        }

        public void adicionarPontos(int p) {
            pontos += p;
        }

        public void removerPontos(int p) {
            pontos -= p;
            if (pontos < 0) pontos = 0;
        }
}


