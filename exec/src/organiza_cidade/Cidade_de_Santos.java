package organiza_cidade;

public class Cidade_de_Santos {
    private String regiao;
    private int populacao;

    Cidade_de_Santos(){
        System.out.println("Cidade de Santos");
    }

    Cidade_de_Santos(String s){

        if(s == "r")
            System.out.println("Secretaria de Regionias");
        if(s == "b")
            System.out.println("Secretaria de Bairros");
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getPopulacao() {
        return populacao;
    }
}
