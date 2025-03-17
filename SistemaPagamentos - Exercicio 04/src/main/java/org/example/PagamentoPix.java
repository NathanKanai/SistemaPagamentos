package org.example;
import java.util.Random;

public class PagamentoPix implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        Random random = new Random();
        String codigoPix = String.format("PIX-%06d", random.nextInt(10000));
        System.out.println("Transação de R$" + valor + " concluída por PIX.");
        System.out.println("Código aleatório gerado: " + codigoPix);
    }
}
