package com.company.Exceptions;

public class NotFoundInArrayException extends Exception {

    public void printErrorMessage() {
        System.out.println("String is not in the array");
    }
}
