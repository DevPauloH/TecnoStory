package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

public record ClienteRecordDTO(@NotBlank String nome, @NotNull String email, @NotNull String telefone, @NotBlank String cpf) {
}
