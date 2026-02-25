package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotBlank;

public record categoriaRecordDTO(Integer id, @NotBlank String nome) {
}
