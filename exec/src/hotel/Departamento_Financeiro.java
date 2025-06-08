package hotel;

public class Departamento_Financeiro extends Rede_hotel {

    @Override
    public void ExibirMensagem (){
        System.out.println("Departamento Financeiro");
    };

    public Departamento_Financeiro(String nome){
        super("Praia");

    }
}
