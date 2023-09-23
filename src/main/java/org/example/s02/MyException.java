package org.example.s02;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
