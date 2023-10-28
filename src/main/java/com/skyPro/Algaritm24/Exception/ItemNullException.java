package com.skyPro.Algaritm24.Exception;

public class ItemNullException extends RuntimeException {
    public ItemNullException() {
    }

    public ItemNullException(String message) {
        super(message);
    }

    public ItemNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemNullException(Throwable cause) {
        super(cause);
    }

    public ItemNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
