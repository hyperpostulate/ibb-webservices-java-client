package org.mesutormanli.ibbwsclient.exception;

/**
 * Bir yanıt gövdesi beklenen türe ayrıştırılamadığında fırlatılır.
 */
public class IbbParseException extends IbbClientException {

    /**
     * Yeni bir istisna oluşturur.
     *
     * @param message hata iletisi
     */
    public IbbParseException(String message) {
        super(message);
    }

    /**
     * Yeni bir istisna oluşturur.
     *
     * @param message hata iletisi
     * @param cause temel neden
     */
    public IbbParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
