package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.marcaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface marcaRepository extends JpaRepository<marcaEntity, Integer> {
}
