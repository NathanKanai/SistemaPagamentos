package org.example;

public class ProcessadorPagamento {
    private FormaPagamento formaPagamento;

    public void definirFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void processar(double valor) {
        if (formaPagamento == null) {
            System.out.println("Nenhuma forma de pagamento selecionada.");
            return;
        }
        formaPagamento.realizarPagamento(valor);
    }
}
