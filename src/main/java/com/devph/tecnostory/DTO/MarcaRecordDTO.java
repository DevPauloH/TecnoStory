package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotBlank;

public record MarcaRecordDTO(Integer id, @NotBlank String nome) {
}
