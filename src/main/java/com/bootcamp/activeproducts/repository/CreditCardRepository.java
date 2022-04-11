package com.bootcamp.activeproducts.repository;


import com.bootcamp.activeproducts.model.CreditCard;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CreditCardRepository extends ReactiveCrudRepository<CreditCard, String> {
    Flux<CreditCard> findByCreditCardNumber(String num);
}
