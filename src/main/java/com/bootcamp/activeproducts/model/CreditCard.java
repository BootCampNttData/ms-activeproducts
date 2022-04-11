package com.bootcamp.activeproducts.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class CreditCard {
    @Id
    private String id;
    private String creditCardNumber;
    private String ClientId;
    private String expeditionDate;
    private String expirationDate;
    private String limit;
}
