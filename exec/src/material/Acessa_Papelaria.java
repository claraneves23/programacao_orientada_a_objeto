package material;

public class Acessa_Papelaria {

    public static void main(String [] args) {

        //primeiro acesso ao método construtor padrão da papelaria
        Papelaria a = new Papelaria();
        a.set_caderno("brochura");
        System.out.println("caderno tipo: " + a.get_caderno());

        Papelaria b = new Papelaria("lápis de cor");
        System.out.println("lápis tipo: " + b.get_lapis() + "\n");

        //segundo aceso ao método construtor padrão da Papelaria
        Material_Escolar c = new Material_Escolar();

        /*terceiro acesso ao método construtor padrão de Papelaria
         * provocado automaticamente por causa da herança */
        Material_Escolar d = new Material_Escolar(33.84, 20);
        System.out.println("preço do caderno R$ " + d.get_preco_caderno());
        System.out.println("quantidade de caixas de lápis de cor: " + d.get_quantidade_caixas_lapis());

        Caderno e = new Caderno();

        e.set_cor("azul");
        e.set_capa("capa dura");
        e.set_qtd_paginas(100);
        System.out.println("\nCaderno \n");
        System.out.println("cor do caderno: \t"+ e.get_cor() );
        System.out.println("tipo de capa: \t"+ e.get_capa() );
        System.out.println("quantidade de folhas: \t"+ e.get_qtd_paginas() );
    }

	/*
	Classe Papelaria
	----------------
	- caderno: String
	- lápis: String
	----------------
	+ Papelaria()
	+ Papelaria(String lápis)
	+ set_caderno(String caderno): void
	+ get_caderno(): String
	+ get_lápis(): String

	Classe Material_Escolar (herda de Papelaria)
	----------------
	- preço_caderno: double
	- quantidade_caixas_lápis: int
	----------------
	+ Material_Escolar()
	+ Material_Escolar(double preço_caderno, int quantidade_caixas_lápis)
	+ get_preço_caderno(): double
	+ get_quantidade_caixas_lápis(): int

	Classe Caderno (herda de Material_Escolar)
	----------------
	- cor: String
	- capa: String
	- qtd_páginas: int
	----------------
	+ Caderno()
	+ set_cor(String cor): void
	+ get_cor(): String
	+ set_capa(String capa): void
	+ get_capa(): String
	+ set_qtd_páginas(int qtd_páginas): void
	+ get_qtd_páginas(): int

	Classe Acessa_Papelaria (classe principal)
	----------------
	+ main(String[] args): void
	*/

}
