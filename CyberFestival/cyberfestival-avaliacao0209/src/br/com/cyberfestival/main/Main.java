package br.com.cyberfestival.main;

import br.com.cyberfestival.model.Bilheteria;
import br.com.cyberfestival.model.Ingresso;
import br.com.cyberfestival.model.IngressoInvalidoException;

/**
 * Classe principal utilizada para testar
 * o funcionamento da bilheteria.
 */
public class Main {

    public static void main(String[] args) {

        // Cria uma nova bilheteria.
        Bilheteria bilheteria = new Bilheteria();

        // Cria os três ingressos solicitados.
        Ingresso ingresso1 = new Ingresso("A-01", "VIP", 500.00);
        Ingresso ingresso2 = new Ingresso("A-02", "PISTA", 200.00);
        Ingresso ingresso3 = new Ingresso("A-01", "PISTA", 200.00);

        // Realiza a venda dos dois primeiros ingressos.
        bilheteria.venderIngresso(ingresso1);
        bilheteria.venderIngresso(ingresso2);

        // Tenta vender o ingresso com código duplicado.
        // O try-catch impede que o programa seja encerrado com erro.
        try {
            bilheteria.venderIngresso(ingresso3);
        } catch (IngressoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        // Calcula e exibe a receita dos ingressos VIP.
        System.out.printf("Receita VIP: %.2f%n", bilheteria.calcularReceitaVIP());
    }
}
