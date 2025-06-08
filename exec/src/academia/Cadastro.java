package academia;

public class Cadastro {
    public static void main(String args[]){
        Aulas aula = new Aulas("Smartfit");
        aula.fazerMatricula();

        Pilates pilates = new Pilates("General");
        pilates.exibirMensagem("Fabiana",1);

        Yoga ioga = new Yoga("EDOS");
        ioga.exibirMensagem("Fabrício","manhã");

    }
}
