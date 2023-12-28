package com.juniormeloDev.YouShoes.service;

import com.juniormeloDev.YouShoes.model.Produto;
import com.juniormeloDev.YouShoes.model.Stock;
import com.juniormeloDev.YouShoes.repository.StockRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;

@Transactional
    public void makeSales(Produto produto,int amount){
    Stock stock = stockRepository.findByProduto( produto);
    if (stock != null && stock.getAmount()>=amount) {
        stock.setAmount(stock.getAmount()-amount);
        stockRepository.save(stock);
    }else {
        throw new RuntimeException("Stock is empty for make sale!");
    }
 }
}
