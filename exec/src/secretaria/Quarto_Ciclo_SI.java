package secretaria;

public class Quarto_Ciclo_SI extends Secretaria_Escolar {

    public static void main(String args[]) {

        //objeto do tipo Secretaria Escolar
        Secretaria_Escolar A = new Secretaria_Escolar();
        Insere_Dados(A);

        Secretaria_Escolar B = new Secretaria_Escolar("Maria", 22, 7.7, "Sistemas para Internet");
        Insere_Dados(B);

    }
    public static void Insere_Dados(Secretaria_Escolar C) {
        System.out.println("Nome do aluno: \t" + C.getNomeAluno());
        System.out.println("Idade do aluno: \t" + C.getIdadeAluno());
        System.out.println("Média do aluno: \t" + C.getMediaAluno());
        System.out.println("Curso do aluno: \t" + C.getCursoAluno());

    }
}
