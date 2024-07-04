package com.nnaltakyan.api.core.common.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Topic {
    EMAIL_VERIFICATION("Email verification");
    private final String name;
}