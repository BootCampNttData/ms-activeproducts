package com.bootcamp.activeproducts.service;

import com.bootcamp.activeproducts.model.CreditCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardService {
    Flux<CreditCard> findAll();
    Mono<CreditCard> create(CreditCard creditCard);
    Flux<CreditCard> findByCreditCardNumber(String num);
    Mono<CreditCard> update(CreditCard creditCard);
    Mono<CreditCard> deleteById(String id);
    Mono delete(CreditCard creditCard);
}
