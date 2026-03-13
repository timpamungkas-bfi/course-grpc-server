package com.course.grpcserver.exception;

public class TransferTransactionPairException extends RuntimeException {

    public TransferTransactionPairException() {
        super("Can't create transfer transaction pair, possibly insufficient balance on source account");
    }

    public TransferTransactionPairException(String message) {
        super(message);
    }

}
