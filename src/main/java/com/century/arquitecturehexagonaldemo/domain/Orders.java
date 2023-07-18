package com.century.arquitecturehexagonaldemo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Orders {
    private String id;
    private String customerId;
    private BigDecimal total;
}
