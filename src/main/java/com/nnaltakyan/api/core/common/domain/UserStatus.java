package com.nnaltakyan.api.core.common.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserStatus {
    CREATED ("CREATED"),
    VERIFIED ("VERIFIED");
    private final String status;
}
