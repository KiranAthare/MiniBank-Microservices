package com.minibank.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account Number of Mini Bank Account"
    )
    @NotEmpty(message = "Account number should not empty")
    private Long accountNumber;

    @Schema(
            description = "Account type of Mini Bank account", example = "Saving"
    )
    @NotEmpty(message = "Account type not empty")
    private String accountType;

    @Schema(
            description = "Mini Bank Branch Address"
    )
    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;
}
