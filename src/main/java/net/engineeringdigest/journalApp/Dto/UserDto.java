package net.engineeringdigest.journalApp.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotEmpty
    @Schema(description = "create your username")
    private String userName;
    @Schema(description = "create password")
    @NotEmpty
    private String password;

    private String email;
    private boolean sentimentAnalysis;

}
