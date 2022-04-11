package com.bootcamp.activeproducts.repository;

import com.bootcamp.activeproducts.model.Credit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CreditRepository extends ReactiveCrudRepository<Credit, String> {
    Flux<Credit> findByClientId(String id);
}
