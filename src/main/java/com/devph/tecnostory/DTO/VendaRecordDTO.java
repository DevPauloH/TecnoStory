package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record VendaRecordDTO(Integer id, @NotNull LocalDateTime dataVenda, @NotNull BigDecimal valorTotal, @NotNull Integer idCliente) {
}
