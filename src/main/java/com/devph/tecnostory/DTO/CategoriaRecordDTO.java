package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotBlank;

public record CategoriaRecordDTO(Integer id, @NotBlank String nome) {
}
