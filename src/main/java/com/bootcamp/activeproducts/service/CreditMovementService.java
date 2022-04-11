package com.bootcamp.activeproducts.service;

import com.bootcamp.activeproducts.model.CreditMovement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditMovementService {
    Flux<CreditMovement> findAll();
    Mono<CreditMovement> create(CreditMovement creditMovement);
    Flux<CreditMovement> findByIdCredit(String id);
    Mono<CreditMovement> update(CreditMovement creditMovement);
    Mono<CreditMovement> deleteById(String id);
    Mono delete(CreditMovement creditMovement);
}
