package com.myself.passworder.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    @NotNull
    @NotBlank
    String username;
    @NotNull
    @NotBlank
    String email;
    @NotNull
    @NotBlank
    String password;
}
