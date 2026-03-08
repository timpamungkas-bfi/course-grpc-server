package com.course.grpcserver.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("bank_transactions")
public class BankTransaction {

    @Id
    private UUID transactionUuid;

    private UUID accountUuid;

    private OffsetDateTime transactionTimestamp;

    private BigDecimal amount;

    private String transactionType;

    private String notes;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

}
