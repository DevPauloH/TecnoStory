package com.devph.tecnostory.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "venda_produto")
public class vendaProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vp", updatable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_venda", nullable = false)
    private vendaEntity venda;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private produtoEntity produto;

    @Column(name = "quant", nullable = false)
    private int quantidade;

    @Column(name = "preco_unitario", precision = 10, scale = 2, nullable = false)
    private BigDecimal precoUnitario;

    public vendaProdutoEntity(vendaEntity venda, produtoEntity produto, int quantidade, BigDecimal precoUnitario) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

}
