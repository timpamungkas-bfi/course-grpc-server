package com.course.grpcserver.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.course.grpcserver.entity.BankTransaction;

public interface BankTransactionRepository extends ListCrudRepository<BankTransaction, UUID> {

}
