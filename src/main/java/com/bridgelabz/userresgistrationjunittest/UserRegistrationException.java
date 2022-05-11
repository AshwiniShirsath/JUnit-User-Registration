package com.bridgelabz.userresgistrationjunittest;

public class UserRegistrationException extends Exception {
    String message;
    static ExceptionType type;

    enum ExceptionType {
        NULL, EMPTY;
    }

    public UserRegistrationException(ExceptionType type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}