package com.denys.exceptions;

public class ECommersPlatformException extends RuntimeException {
    public ECommersPlatformException(String errorMessage) {
        super(errorMessage);
    }

    public ECommersPlatformException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}