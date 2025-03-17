package org.example;
import java.util.Random;

public class PagamentoBoleto implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        Random random = new Random();
        String codigoBoleto = String.format("BOLETO-%08d", random.nextInt(10000));
        System.out.println("Transação de R$" + valor + " concluída por boleto.");
        System.out.println("Código do boleto fictício: " + codigoBoleto);
    }
}
