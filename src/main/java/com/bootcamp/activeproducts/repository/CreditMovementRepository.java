package com.bootcamp.activeproducts.repository;

import com.bootcamp.activeproducts.model.CreditMovement;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CreditMovementRepository extends ReactiveCrudRepository<CreditMovement, String> {
    Flux<CreditMovement> findByIdCredit(String id);
}
