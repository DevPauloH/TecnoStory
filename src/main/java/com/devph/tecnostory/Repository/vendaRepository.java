package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.vendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vendaRepository extends JpaRepository<vendaEntity, Integer> {
}
