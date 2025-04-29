package oficina;

public class Concessionaria_Volks extends Oficina_Mecanica {


    @Override
    public String pintura() {
        return "pintura de preto";
    }

    @Override
    public String eletrica() {
        return "troca lanterna";
    }

    @Override
    public String funilaria() {
        return "desamassar traseira";
    }

}
