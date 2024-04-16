package com.kubernetesdemo.kuberdemo.common.enums;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    AUTHENTICATION_FAILED(HttpStatus.FORBIDDEN.value(),"AUTHENTICATION_FAILED"),
    LOGIN_FAILED(HttpStatus.NOT_FOUND.value(),"LOGIN_FAILED"),
    ACCESS_DENIED(HttpStatus.UNAUTHORIZED.value(), "ACCESS_DENIED"),
    TOKEN_GENERATION_FAILED(HttpStatus.UNAUTHORIZED.value(),"TOKEN_GENERATION_FAILED");
    private final int status;
    private final String message;
}
