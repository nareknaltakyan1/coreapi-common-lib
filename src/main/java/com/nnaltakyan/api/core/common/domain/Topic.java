package com.nnaltakyan.api.core.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Topic {
    EMAIL_VERIFICATION("Email verification");
    private String topicName;
}
