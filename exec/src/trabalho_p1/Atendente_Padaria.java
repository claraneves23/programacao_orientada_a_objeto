package trabalho_p1;

public class Atendente_Padaria {
    public static void main( String args []) {


        Padeiro p2 = new Padeiro("João");
        p2.setNome("Boa Sorte");
        p2.setLocalizacao("Guarujá");
        p2.setTelefone("3342-6035");
        p2.setNomeP("João");

        Pao p3 = new Pao("Croissant", 5);

        p3.setNome("Dom Carlos");
        p3.setLocalizacao("Santos");
        p3.setTelefone("3329-1075");

        System.out.println("-------------DADOS---------------\n");
        System.out.println("\nPadaria: " + p2.getNome() + "\nLocalização: "+ p2.getLocalizacao()+ "\nTelefone: "+p2.getTelefone()+ "\nPadeiro: "+p2.nomeP);
        System.out.println("-------------DADOS---------------\n");
        System.out.println("\nPadaria: " + p3.getNome() + "\nLocalização: "+ p3.getLocalizacao()+ "\nTelefone: "+p3.getTelefone()+ "\nTipo de pão: "+ p3.getTipo() + "\nValor da unidade: "+p3.getValor());

    }
}
