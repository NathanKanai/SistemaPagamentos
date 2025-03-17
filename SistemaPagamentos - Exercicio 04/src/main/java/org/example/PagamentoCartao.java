package org.example;
import java.util.Scanner;

public class PagamentoCartao implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número do cartão: ");
        String numeroCartao = scanner.nextLine();
        System.out.println("Transação de R$" + valor + " concluída com cartão de crédito: " + numeroCartao);
    }
}
