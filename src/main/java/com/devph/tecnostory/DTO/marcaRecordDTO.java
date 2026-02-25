package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotBlank;

public record marcaRecordDTO(Integer id, @NotBlank String nome) {
}
