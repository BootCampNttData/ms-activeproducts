package com.bootcamp.corporateclients.controller;

import com.bootcamp.activeproducts.model.CreditCardMovement;
import com.bootcamp.activeproducts.service.CreditCardMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/creditCardMovement")
@RequiredArgsConstructor
public class CreditCardMovementController {
    public final CreditCardMovementService service;
    @GetMapping
    public Flux<CreditCardMovement> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{num}")
    public Flux<CreditCardMovement> getByIdCreditCard(@PathVariable("num") String num){
        return service.getByIdCreditCard(num);
    }

    @PostMapping
    public Mono<CreditCardMovement> create(@RequestBody CreditCardMovement creditCardMovement){
        return service.create(creditCardMovement);
    }

    @PostMapping("/update")
    public Mono<CreditCardMovement> update(@RequestBody CreditCardMovement creditCardMovement){
        return service.create(creditCardMovement);
    }

    @DeleteMapping
    public Mono<CreditCardMovement> delete(@RequestBody CreditCardMovement creditCardMovement){
        return service.delete(creditCardMovement);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<CreditCardMovement> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }

}