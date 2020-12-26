package com.company.Exceptions;

public class IllegalArgumentException extends Exception {

    public IllegalArgumentException() {
    }

    public void printErrorKvadrat() {
        System.out.println("Number must be between 1-20");
    }



}
