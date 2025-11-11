package com.devph.tecnostory.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", updatable = false)
    private int id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;


    public CategoriaEntity(String nome) {
        this.nome = nome;
    }
}
