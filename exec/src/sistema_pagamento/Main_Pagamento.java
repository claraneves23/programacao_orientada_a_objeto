package sistema_pagamento;

public class Main_Pagamento {
    public static void main (String args[]){

        Pagamento pagamento = new Pagamento();
        pagamento.pagar(200);

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.pagar(200);
        pagamentoCartao.pagar(5,200);

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.pagar(200);

    }
}
