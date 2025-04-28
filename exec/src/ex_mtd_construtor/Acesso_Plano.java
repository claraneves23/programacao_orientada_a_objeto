package ex_mtd_construtor;

public class Acesso_Plano {
    public static void main (String args[]) {
        Plano_Ensino a = new Plano_Ensino();
        Plano_Ensino b = new Plano_Ensino("Calculo I", "Funções", "média provas + TPs","Fundamentos da matemática");

        a.set_matéria("Programação Orientada a Objetos");
        a.set_conteúdo_pragmático("Métodos Construtores");
        a.set_critério_avaliação("Média dos trabalhos");
        a.set_bibliografia("Tannenbaun");

        System.out.println("matéria: \t"+ a.get_matéria() + "\nconteudo pragmático: \t"+ a.get_conteúdo_pragmático() + "\ncritério de avaliação: \t"+ a.get_critério_avaliação()+ "\nbibliografia: \t"+ a.get_bibliografia());
        System.out.println("\nmatéria:\t"+ b.get_matéria() + "\nconteudo pragmático:\t"+ b.get_conteúdo_pragmático() + "\ncritério de avaliação:\t"+ b.get_critério_avaliação()+ "\nbibliografia:\t"+ b.get_bibliografia());

    }
}
