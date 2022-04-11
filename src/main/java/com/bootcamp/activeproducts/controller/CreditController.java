package com.bootcamp.corporateclients.controller;

import com.bootcamp.activeproducts.model.Credit;
import com.bootcamp.activeproducts.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditController {
    public final CreditService service;
    @GetMapping
    public Flux<Credit> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{num}")
    public Flux<Credit> findByClientId(@PathVariable("id") String id){
        return service.findByClientId(id);
    }

    @PostMapping
    public Mono<Credit> create(@RequestBody Credit credit){
        return service.create(credit);
    }

    @PostMapping("/update")
    public Mono<Credit> update(@RequestBody Credit credit){
        return service.create(credit);
    }

    @DeleteMapping
    public Mono<Credit> delete(@RequestBody Credit credit){
        return service.delete(credit);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<Credit> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }

}