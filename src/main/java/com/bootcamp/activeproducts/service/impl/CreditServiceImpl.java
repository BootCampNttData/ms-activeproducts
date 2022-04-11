package com.bootcamp.activeproducts.service.impl;

import com.bootcamp.activeproducts.model.Credit;
import com.bootcamp.activeproducts.repository.CreditRepository;
import com.bootcamp.activeproducts.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class CreditServiceImpl implements CreditService {
    public final CreditRepository repository;

    @Override
    public Mono<Credit> create(Credit credit) {
        return repository.save(credit);
    }



    @Override
    public Mono<Credit> update(Credit credit) {
        return repository.save(credit);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(Credit credit) {
        return repository.delete(credit);
    }

    @Override
    public Flux<Credit> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Credit> findByClientId(String id) {
        return repository.findByClientId(id);
    }
}