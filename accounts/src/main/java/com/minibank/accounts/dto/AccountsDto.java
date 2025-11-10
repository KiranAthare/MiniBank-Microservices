package com.minibank.accounts.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number should not empty")
    private Long accountNumber;

    @NotEmpty(message = "Account type not empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;
}
