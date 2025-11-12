package com.devph.tecnostory.Repository;

import com.devph.tecnostory.DTO.ClienteRecordDTO;
import com.devph.tecnostory.Model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
