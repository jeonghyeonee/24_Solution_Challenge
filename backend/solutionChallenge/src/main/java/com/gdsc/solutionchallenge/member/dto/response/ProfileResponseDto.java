package com.gdsc.solutionchallenge.member.dto.response;

import lombok.Getter;

@Getter
public abstract class ProfileResponseDto {

    private String username;

    public void SetUsername(String username) {
        this.username = username;
    }
}