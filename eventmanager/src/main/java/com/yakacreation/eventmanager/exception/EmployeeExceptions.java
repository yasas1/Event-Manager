package com.yakacreation.eventmanager.exception;

public class EmployeeExceptions {

    public static class UserNotFoundException extends RuntimeException{
        public UserNotFoundException(String message){
            super(message);
        }
    }
}
