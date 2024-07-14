package com.nnaltakyan.api.core.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessages
{
	VERIFICATION_NOT_FOUND("Verification record not found."), USER_NOT_FOUND("User record not found.");
	private String message;
}
