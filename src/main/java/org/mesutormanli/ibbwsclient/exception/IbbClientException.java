package org.mesutormanli.ibbwsclient.exception;

/**
 * Kütüphane genelinde fırlatılan çalışma zamanı istisnasıdır.
 * <p>
 * HTTP/ağ hataları, hatalı HTTP durum kodları, yanıt ayrıştırma (parse) hataları
 * ve API kaynaklı hatalar bu istisna ile raporlanır.
 */
public class IbbClientException extends RuntimeException {

    /**
     * Verilen mesajla yeni bir istisna oluşturur.
     *
     * @param message istisna mesajı
     */
    public IbbClientException(String message) {
        super(message);
    }

    /**
     * Verilen mesaj ve nedenle yeni bir istisna oluşturur.
     *
     * @param message istisna mesajı
     * @param cause istisnanın nedeni
     */
    public IbbClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
