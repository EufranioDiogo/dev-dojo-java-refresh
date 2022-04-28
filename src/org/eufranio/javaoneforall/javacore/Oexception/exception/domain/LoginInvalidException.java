package org.eufranio.javaoneforall.javacore.Oexception.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Invalid Login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
