package com.course.grpcserver.exception;

public class AccountBlockedException extends RuntimeException {

    public AccountBlockedException(String accountNumber) {
        super(String.format("Account number %s is blocked", accountNumber));
    }

}
