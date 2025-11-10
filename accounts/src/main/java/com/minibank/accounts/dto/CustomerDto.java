package com.minibank.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 to 10")
    private String name;

    @NotEmpty(message = "Email can not be null or Empty")
    @Email(message = "Email should be proper")
    private String email;

    @NotEmpty(message = "Mobile number can not be a null or empty")
    @Size(min = 10, max = 10, message = "Mobile number should be 10 digit")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
