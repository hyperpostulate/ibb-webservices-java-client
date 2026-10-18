package org.mesutormanli.ibbwsclient.exception;

/**
 * Bir istek HTTP hata durumu yanıtı aldığında fırlatılır. Durum kodu, durum metni ve yanıt gövdesini taşır;
 * böylece çağıranlar hataları programatik olarak ele alabilir. İleti; durumu, URL'yi ve (varsa) gövdenin ilk
 * 512 karakterini içerir.
 */
public class IbbHttpException extends IbbClientException {

    private static final int MAX_BODY_LENGTH = 512;

    private final int status;
    private final String statusText;
    private final String url;
    private final String body;

    /**
     * Yeni bir istisna oluşturur.
     *
     * @param status HTTP durum kodu
     * @param statusText HTTP durum metni
     * @param url istek gönderilen URL
     * @param body yanıt gövdesi
     */
    public IbbHttpException(int status, String statusText, String url, String body) {
        super(buildMessage(status, statusText, url, body));
        this.status = status;
        this.statusText = statusText;
        this.url = url;
        this.body = body;
    }

    /**
     * HTTP durum kodunu döndürür.
     *
     * @return HTTP durum kodu
     */
    public int getStatus() {
        return status;
    }

    /**
     * HTTP durum metnini döndürür.
     *
     * @return HTTP durum metni
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * İsteğin gönderildiği URL'yi döndürür.
     *
     * @return istek URL'si
     */
    public String getUrl() {
        return url;
    }

    /**
     * Yanıt gövdesini döndürür.
     *
     * @return yanıt gövdesi
     */
    public String getBody() {
        return body;
    }

    private static String buildMessage(int status, String statusText, String url, String body) {
        StringBuilder message = new StringBuilder("HTTP ").append(status).append(" ").append(statusText)
                .append(" for ").append(url);
        if (body != null && !body.isBlank()) {
            message.append(" — body: ").append(body, 0, Math.min(body.length(), MAX_BODY_LENGTH));
        }
        return message.toString();
    }
}
