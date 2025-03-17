package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessadorPagamento processador = new ProcessadorPagamento();

        while (true) {
            System.out.println("\nSelecione uma forma de pagamento:");
            System.out.println("1 - PIX");
            System.out.println("2 - Cartão de Crédito");
            System.out.println("3 - Boleto");
            System.out.print("Escolha sua Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Insira o valor da transação: R$");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    processador.definirFormaPagamento(new PagamentoPix());
                    break;
                case 2:
                    processador.definirFormaPagamento(new PagamentoCartao());
                    break;
                case 3:
                    processador.definirFormaPagamento(new PagamentoBoleto());
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            processador.processar(valor);
        }

    }
}