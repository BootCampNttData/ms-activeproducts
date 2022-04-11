package com.bootcamp.activeproducts.model;

import org.springframework.data.annotation.Id;

public class CreditMovement {
    @Id
    private String id;
    private String idCredit;
    private String movementDate;
    private String amount;
}
    