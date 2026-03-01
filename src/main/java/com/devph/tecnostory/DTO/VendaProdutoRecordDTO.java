package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record VendaProdutoRecordDTO(Integer id, @NotNull Integer idVenda, @NotNull Integer idProduto, @NotNull Integer quantidade, @NotNull BigDecimal precoUnitario) {
}
