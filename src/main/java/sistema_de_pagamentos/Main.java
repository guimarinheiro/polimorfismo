package sistema_de_pagamentos;

import java.time.LocalDate;

/* Classe principal para testar o sistema de pagamentos. */
public class Main {
    public static void main(String[] args) {
        CaixaFinanceiro caixa = new CaixaFinanceiro();

        Pagamento p1 = new PagamentoCartaoCredito(250.0, LocalDate.now(), "1234-****-****-5678");
        Pagamento p2 = new PagamentoPix(150.0, LocalDate.now(), "email@cliente.com");
        Pagamento p3 = new PagamentoBoleto(320.0, LocalDate.now(), "001245678900123456");

        caixa.adicionarPagamento(p1);
        caixa.adicionarPagamento(p2);
        caixa.adicionarPagamento(p3);

        caixa.executarPagamentos();
    }
}

