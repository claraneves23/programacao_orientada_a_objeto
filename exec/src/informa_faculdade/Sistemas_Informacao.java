package informa_faculdade;

public class Sistemas_Informacao extends Fatec {

    Fatec curso1 = new Fatec();

    public Sistemas_Informacao(){

        curso1.mostraCurso();

        curso1.setNomeCurso("Tecnologia em Sistemas de Informação");
        curso1.setQuantidadeAlunos(160);

        curso1.atualizaAlunos(20);
        curso1.mostraCurso();

        mostraCurso();
    }

    public void mostraCurso(){
        curso1.setNomeCurso("Bacharel em Sistemas de Informação");
        curso1.setQuantidadeAlunos(40);
        System.out.println("nome do curso  " + curso1.getNomeCurso() + "\n" + "quantidade de alunos  " + curso1.getQuantidadeAlunos());
    }
}
