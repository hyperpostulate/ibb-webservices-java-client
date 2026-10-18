package org.mesutormanli.ibbwsclient.exception;

/**
 * Bağlantı veya zaman aşımı hataları gibi taşıma düzeyindeki hatalarda fırlatılır.
 */
public class IbbNetworkException extends IbbClientException {

    /**
     * Yeni bir istisna oluşturur.
     *
     * @param message hata iletisi
     */
    public IbbNetworkException(String message) {
        super(message);
    }

    /**
     * Yeni bir istisna oluşturur.
     *
     * @param message hata iletisi
     * @param cause temel neden
     */
    public IbbNetworkException(String message, Throwable cause) {
        super(message, cause);
    }
}
