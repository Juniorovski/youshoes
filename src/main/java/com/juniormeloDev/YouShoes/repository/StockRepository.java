package com.juniormeloDev.YouShoes.repository;

import com.juniormeloDev.YouShoes.model.Produto;
import com.juniormeloDev.YouShoes.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
    Stock findByProduto(Produto produto);
}
