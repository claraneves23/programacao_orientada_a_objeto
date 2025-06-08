package sistema_pagamento;

public class PagamentoBoleto extends Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("O valor do boleto é de R$ " + valor);
    }
}
