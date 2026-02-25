package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.clienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<clienteEntity, Integer> {
}
