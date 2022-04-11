package com.bootcamp.activeproducts.service.impl;

import com.bootcamp.activeproducts.model.CreditCardMovement;
import com.bootcamp.activeproducts.repository.CreditCardMovementRepository;
import com.bootcamp.activeproducts.service.CreditCardMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class CreditCardMovementServiceImpl implements CreditCardMovementService {
    public final CreditCardMovementRepository repository;

    @Override
    public Mono<CreditCardMovement> create(CreditCardMovement creditCardMovement) {
        return repository.save(creditCardMovement);
    }

    @Override
    public Mono<CreditCardMovement> update(CreditCardMovement creditCardMovement) {
        return repository.save(creditCardMovement);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(CreditCardMovement creditCardMovement) {
        return repository.delete(creditCardMovement);
    }

    @Override
    public Flux<CreditCardMovement> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<CreditCardMovement> getByIdCreditCard(String id) {
        return repository.findByIdCreditCad(id);
    }

}