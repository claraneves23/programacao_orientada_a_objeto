package informa_faculdade;

public class Fatec {

    private String nomeCurso;

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    private int quantidadeAlunos;

    public Fatec(){
        nomeCurso = "";
        quantidadeAlunos = 0;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void mostraCurso(){
        System.out.println("nome do curso  " + nomeCurso + "\n" + "quantidade de alunos  " + quantidadeAlunos);
    }

    public void atualizaAlunos(int matriculas){
        quantidadeAlunos = quantidadeAlunos + matriculas;
    }

}
