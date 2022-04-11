package com.bootcamp.activeproducts.service;

import com.bootcamp.activeproducts.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> findAll();
    Mono<Credit> create(Credit credit);
    Flux<Credit> findByClientId(String id);
    Mono<Credit> update(Credit credit);
    Mono<Credit> deleteById(String id);
    Mono delete(Credit credit);
}
