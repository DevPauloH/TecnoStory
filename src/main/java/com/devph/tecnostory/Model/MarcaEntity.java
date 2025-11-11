package com.devph.tecnostory.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "marca")
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca", updatable = false)
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;


    public MarcaEntity(String nome) {
        this.nome = nome;
    }
}
