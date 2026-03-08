package com.course.grpcserver.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("bank_accounts")
public class BankAccount {

    @Id
    private UUID accountUuid;

    private String accountNumber;

    private String accountName;

    private String currency;

    private BigDecimal currentBalance;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

}
