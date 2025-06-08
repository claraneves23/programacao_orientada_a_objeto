package academia;

public class Pilates extends Aulas{

    private String instrutor;
    private int sala;


    public Pilates(String nome) {
        super(nome);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void exibirMensagem(String instrutor, int sala){
        System.out.println("A aula de Pilates acontece na sala " + sala + " e é ministrada pela instrutora " + instrutor);
    }

}


