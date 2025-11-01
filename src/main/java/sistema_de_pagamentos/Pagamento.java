package sistema_de_pagamentos;

import java.time.LocalDate;

/* Classe abstrata que representa um pagamento genérico. */
public abstract class Pagamento {
    protected double valor;
    protected LocalDate data;

    public Pagamento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    /* Método abstrato que deve ser implementado pelas subclasses. */
    public abstract void processarPagamento();
}
