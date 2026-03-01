package com.devph.tecnostory.Repository;

import com.devph.tecnostory.Model.categoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoriaRepository extends JpaRepository<categoriaEntity, Integer> {
}
