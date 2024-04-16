package com.kubernetesdemo.kuberdemo.common.exception;

import com.kubernetesdemo.kuberdemo.common.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{
    private int status;
    private String message;
}
