package com.nnaltakyan.api.core.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserStatus {
    CREATED ("CREATED"),
    VERIFIED ("VERIFIED");
    private String status;
}
