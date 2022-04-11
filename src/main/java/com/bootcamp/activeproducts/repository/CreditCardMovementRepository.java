package com.bootcamp.activeproducts.repository;

import com.bootcamp.activeproducts.model.CreditCardMovement;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CreditCardMovementRepository extends ReactiveCrudRepository<CreditCardMovement, String> {
    Flux<CreditCardMovement> findByIdCreditCad(String id);
}
