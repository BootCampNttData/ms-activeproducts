package com.bootcamp.activeproducts.service;

import com.bootcamp.activeproducts.model.CreditCardMovement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardMovementService {
    Flux<CreditCardMovement> findAll();
    Mono<CreditCardMovement> create(CreditCardMovement creditCardMovement);
    Flux<CreditCardMovement> getByIdCreditCard(String num);
    Mono<CreditCardMovement> update(CreditCardMovement creditCardMovement);
    Mono<CreditCardMovement> deleteById(String id);
    Mono delete(CreditCardMovement creditCardMovement);
}
