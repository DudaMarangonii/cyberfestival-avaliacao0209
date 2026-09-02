package br.com.cyberfestival.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa a bilheteria do CyberFestival.
 * Armazena os ingressos vendidos em memória e
 * calcula a receita dos ingressos VIP.
 */
public class Bilheteria {

    // Mapa que funciona como um banco de dados em memória.
    // A chave é o código do ingresso.
    private Map<String, Ingresso> ingressosVendidos = new HashMap<>();

    /**
     * Realiza a venda de um ingresso.
     * Antes de adicionar, verifica se o código já existe.
     */
    public void venderIngresso(Ingresso ingresso) {

        // Se o código já estiver no mapa, o ingresso é inválido.
        if (ingressosVendidos.containsKey(ingresso.getCodigoId())) {
            throw new IngressoInvalidoException();
        }

        // Caso o código seja novo, adiciona o ingresso ao mapa.
        ingressosVendidos.put(ingresso.getCodigoId(), ingresso);
    }

    /**
     * Calcula a receita apenas dos ingressos VIP.
     * A regra exige o uso da Stream API, sem for ou if.
     */
    public double calcularReceitaVIP() {

        return ingressosVendidos.values()
                .stream()
                .filter(ingresso -> ingresso.getTipo().equals("VIP"))
                .mapToDouble(Ingresso::getValor)
                .sum();
    }
}
