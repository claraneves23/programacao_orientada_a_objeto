package sistema_pagamento;

public class PagamentoCartao extends Pagamento{

    @Override
    public void pagar(double valor){
        System.out.println("A sua fatura no cartão é de R$ " + valor);
    }

    public void pagar(int parcelas, double valor){
        System.out.println("Você pode parcelar o valor " + valor + " em até " + parcelas + " vezes");
    }
}
