package com.devph.tecnostory.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutoRecordDTO(Integer id, @NotBlank String nome, @NotNull Integer idMarca, String descricao, @NotNull BigDecimal preco, @NotNull Integer quantidadeEstoque, String codigoDeBarras, @NotNull Integer categoria) {
}
