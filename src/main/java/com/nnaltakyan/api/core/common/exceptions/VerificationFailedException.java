package com.nnaltakyan.api.core.common.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class VerificationFailedException extends RuntimeException{
    private String message;
}
