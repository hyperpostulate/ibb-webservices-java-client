package org.mesutormanli.ibbwsclient.exception;

public class IbbClientException extends RuntimeException {

    public IbbClientException(String message) {
        super(message);
    }

    public IbbClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
