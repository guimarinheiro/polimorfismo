package sistema_de_pagamentos;

import java.time.LocalDate;

/* Classe que representa um pagamento com cartão de crédito. */
public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, LocalDate data, String numeroCartao) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor + 
            " com cartao de credito numero " + numeroCartao + " em " + data);
    }
}
