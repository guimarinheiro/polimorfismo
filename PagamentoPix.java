package sistema_de_pagamentos;

import java.time.LocalDate;

/* Classe que representa um pagamento via PIX. */
public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, LocalDate data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor +
            " via PIX para a chave " + chavePix + " em " + data);
    }
}
