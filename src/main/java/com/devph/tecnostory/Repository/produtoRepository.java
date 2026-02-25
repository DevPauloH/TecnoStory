package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.produtoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtoRepository extends JpaRepository<produtoEntity, Integer> {
}
