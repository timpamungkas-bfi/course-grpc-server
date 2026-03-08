package com.course.grpcserver.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("bank_transfers")
public class BankTransfer {

    @Id
    private UUID transferUuid;

    private UUID fromAccountUuid;

    private UUID toAccountUuid;

    private String currency;

    private BigDecimal amount;

    private OffsetDateTime transferTimestamp;

    private boolean transferSuccess;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

}
