package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundExceptiom extends RuntimeException{

    public NotFoundExceptiom(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
