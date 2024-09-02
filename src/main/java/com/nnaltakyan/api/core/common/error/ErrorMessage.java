package com.nnaltakyan.api.core.common.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage
{
	VERIFICATION_FAILED("Verification record not found."), USER_NOT_FOUND("User record not found.");
	private final String message;
}
