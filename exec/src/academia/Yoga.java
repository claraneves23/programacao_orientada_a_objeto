package academia;

public class Yoga extends Aulas {

    private String instrutor;
    private String periodo;

    public Yoga(String nome) {
        super(nome);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void exibirMensagem(String instrutor, String periodo){
        System.out.println("As aulas de yoga são ministradas pelo instrutor "+ instrutor + "no periodo " + periodo);

    }



}
