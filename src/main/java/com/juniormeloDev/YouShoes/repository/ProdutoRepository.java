package com.juniormeloDev.YouShoes.repository;

import com.juniormeloDev.YouShoes.model.Category;
import com.juniormeloDev.YouShoes.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
