package sistema_de_pagamentos;

import java.util.ArrayList;
import java.util.List;

/* Classe responsável por gerenciar os pagamentos. */
public class CaixaFinanceiro {
    private List<Pagamento> pagamentos;

    public CaixaFinanceiro() {
        pagamentos = new ArrayList<>();
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void executarPagamentos() {
        System.out.println("---- Executando Pagamentos ----");
        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento();
        }
        System.out.println("---- Fim do Processamento ----");
    }
}

