package com.gdsc.solutionchallenge.app.exception;

import com.gdsc.solutionchallenge.exception.GeneralException;

public class ImageNotFoundException extends GeneralException {

    private static final String MESSAGE = "에 해당하는 이미지가 없습니다.";

    private static final int CODE = 404;

    public ImageNotFoundException(Long imageId) {
        super("imageId=" + imageId + MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return CODE;
    }
}
