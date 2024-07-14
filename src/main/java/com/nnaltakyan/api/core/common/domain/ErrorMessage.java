package com.nnaltakyan.api.core.common.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage
{
	VERIFICATION_NOT_FOUND("Verification record not found."), USER_NOT_FOUND("User record not found.");
	private final String message;
}
