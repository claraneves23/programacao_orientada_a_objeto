package oficina;

public class Concessionaria_Ford extends Oficina_Mecanica {

    @Override
    public String funilaria() {
        return "desamassar a porta";
    }

    @Override
    public String eletrica() {
        return "instalar o freio ABS";
    }

    @Override
    public String pintura() {
        return "pintar o carro de prata";
    }
}
