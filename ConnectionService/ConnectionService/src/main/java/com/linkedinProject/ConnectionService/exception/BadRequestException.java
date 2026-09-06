package com.linkedinProject.ConnectionService.exception;

public class BadRequestException extends  RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
