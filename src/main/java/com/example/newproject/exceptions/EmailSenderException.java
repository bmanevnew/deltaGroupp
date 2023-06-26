package com.example.newproject.exceptions;

public class EmailSenderException extends RuntimeException{
    public EmailSenderException(String message){
        super(message);
    }
}
