package com.course.grpcserver.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.course.grpcserver.entity.BankExchangeRate;

public interface BankExchangeRateRepository extends ListCrudRepository<BankExchangeRate, UUID> {

}
