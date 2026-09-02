package br.com.cyberfestival.model;

/**
 * Representa um ingresso vendido pelo CyberFestival.
 * Esta classe possui os dados básicos de identificação,
 * tipo e valor do ingresso.
 */
public class Ingresso {

    // Código único que identifica o ingresso.
    private String codigoId;

    // Tipo do ingresso, como VIP ou PISTA.
    private String tipo;

    // Valor pago pelo ingresso.
    private double valor;

    /**
     * Construtor completo da classe.
     * Recebe todas as informações necessárias para criar um ingresso.
     */
    public Ingresso(String codigoId, String tipo, double valor) {
        this.codigoId = codigoId;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Retorna o código de identificação do ingresso.
    public String getCodigoId() {
        return codigoId;
    }

    // Retorna o tipo do ingresso.
    public String getTipo() {
        return tipo;
    }

    // Retorna o valor do ingresso.
    public double getValor() {
        return valor;
    }
}
