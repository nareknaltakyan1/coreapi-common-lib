package com.nnaltakyan.api.core.common.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public enum EmailType
{

	VERIFICATION(false);

	private final boolean resendAllowed;
}
