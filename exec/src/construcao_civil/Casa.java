package construcao_civil;

public class Casa extends Construcao {

    Construcao casa = new Construcao();

    public Casa(){
        casa.setTipo("CASA");
    }


    public void constroi() {
        System.out.println("FAZ-SE " + casa.getTipo());
    }
}
