package com.minibank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Kiran Athare"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 to 10")
    private String name;

    @Schema(
            description = "Email of the customer", example = "kiranathare111@gmail.com"
    )
    @NotEmpty(message = "Email can not be null or Empty")
    @Email(message = "Email should be proper")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "8381055613"
    )
    @NotEmpty(message = "Mobile number can not be a null or empty")
    @Size(min = 10, max = 10, message = "Mobile number should be 10 digit")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
