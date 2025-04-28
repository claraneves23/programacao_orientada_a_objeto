package organiza_cidade;

public class Prefeitura {
    public static void main(String args[]) {

        Regiao_de_Santos r = new Regiao_de_Santos();
        Bairro_de_Santos b = new Bairro_de_Santos();
        Cidade_de_Santos c = new Cidade_de_Santos();
        Logradouro l = new Logradouro();
        /*classe de hierarquia mais inferior dá acesso a todos os atributos*/

        b.setBairro("Jardim Radio Clube");
        b.setRegiao("Zona Noroeste");
        b.setRua("Álvaro Guimarões");
        b.setPopulacao(1000000);
        System.out.println("BAIRRO: " + b.getBairro());
        System.out.println("REGIÃO: " + b.getRegiao());
        System.out.println("RUA: " + b.getRua());
        System.out.println("POPULAÇÃO: " + b.getPopulacao());

        /*não dá acesso aos atributos da classe inferior */
        r.setRegiao("Zona Leste");
        r.setBairro("Marapé");
        r.setPopulacao(900000);
        System.out.println("BAIRRO: " + r.getBairro());
        System.out.println("REGIÃO: " + r.getRegiao());
        System.out.println("POPULAÇÃO: " + r.getPopulacao());

        c.setRegiao("Região Central");
        c.setPopulacao(200000);
        System.out.println("REGIÃO: " + c.getRegiao());
        System.out.println("POPULAÇÃO: " + c.getPopulacao());

        l.setBairro("Vila Mathias");
        l.setRegiao("Centro");
        l.setPopulacao(3000);
        l.setTipoLogradouro("Avenida");
        l.setLocalLogradouro("Senador Feijó");

        System.out.println("BAIRRO: " + l.getBairro());
        System.out.println("REGIÃO: " + l.getRegiao());
        System.out.println("POPULAÇÃO: " + l.getPopulacao());
        System.out.println("TIPO DE LOGRADOURO: " + l.getTipoLogradouro());
        System.out.println("LOCAL DO LOGRADOURO: " + l.getLocalLogradouro());



    }
}
