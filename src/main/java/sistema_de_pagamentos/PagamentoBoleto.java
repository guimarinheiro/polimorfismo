package sistema_de_pagamentos;

import java.time.LocalDate;

/* Classe que representa um pagamento via boleto. */
public class PagamentoBoleto extends Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(double valor, LocalDate data, String codigoBoleto) {
        super(valor, data);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor +
            " via boleto codigo " + codigoBoleto + " em " + data);
    }
}
