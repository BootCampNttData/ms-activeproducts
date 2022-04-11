package com.bootcamp.activeproducts.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Credit {
    @Id
    private String id;
    private String clientId;
    private String creditDate;
    private String loanAmount;
    private String loanTermInMonths;
    private String annualInterestRate;
}
