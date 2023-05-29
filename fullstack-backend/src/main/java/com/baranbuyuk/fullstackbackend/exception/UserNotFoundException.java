package com.baranbuyuk.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Bu kimliğe sahip bir kullanıcı bulunamadı" + id);
    }
}
