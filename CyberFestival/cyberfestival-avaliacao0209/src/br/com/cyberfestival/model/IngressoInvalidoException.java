package br.com.cyberfestival.model;

/**
 * Exceção utilizada quando um ingresso possui
 * um código que já foi utilizado na bilheteria.
 */
public class IngressoInvalidoException extends RuntimeException {

    /**
     * Construtor da exceção.
     * Envia a mensagem de segurança solicitada pela regra de negócio.
     */
    public IngressoInvalidoException() {
        super("Erro de Segurança: Ingresso já validado ou código duplicado!");
    }
}