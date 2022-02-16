package com.company.hm16;

public class FileMaxSizeReachedException extends Exception{
    private final String exception;

    public FileMaxSizeReachedException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return exception;
    }
}
