package com.einlourice.biography.common.domain;

import lombok.Data;

@Data
public abstract class BaseDomain {
    protected String createdBy;
    protected String createdDate;
}
