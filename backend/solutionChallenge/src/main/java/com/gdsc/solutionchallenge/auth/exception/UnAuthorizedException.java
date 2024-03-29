package com.gdsc.solutionchallenge.auth.exception;


import com.gdsc.solutionchallenge.exception.GeneralException;

public class UnAuthorizedException extends GeneralException {

    private static final String MESSAGE = "사용자 인증이 필요합니다.";
    private static final int CODE = 401;


    public UnAuthorizedException() {
        super(MESSAGE);
    }

    public UnAuthorizedException(String message) {
        super(MESSAGE);
        addValidation("auth", message);
    }

    @Override
    public int getStatusCode() {
        return CODE;
    }
}
