package com.course.grpcserver.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.course.grpcserver.entity.BankTransfer;

public interface BankTransferRepository extends ListCrudRepository<BankTransfer, UUID> {

}
