package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.VendaProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaProdutoRepository extends JpaRepository<VendaProdutoEntity, Integer> {
}
