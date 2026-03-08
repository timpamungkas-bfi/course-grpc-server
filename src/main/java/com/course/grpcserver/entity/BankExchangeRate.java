package com.course.grpcserver.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("bank_exchange_rates")
public class BankExchangeRate {

    @Id
    private UUID exchangeRateUuid;

    private String fromCurrency;

    private String toCurrency;

    private BigDecimal rate;

    private OffsetDateTime validFromTimestamp;

    private OffsetDateTime validToTimestamp;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

}
