package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<VendaEntity, Integer> {
}
