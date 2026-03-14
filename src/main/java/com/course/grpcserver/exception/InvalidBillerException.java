package com.course.grpcserver.exception;

public class InvalidBillerException extends RuntimeException {

    public InvalidBillerException(String billerCode) {
        super(String.format("Invalid biller code: %s", billerCode));
    }

}
