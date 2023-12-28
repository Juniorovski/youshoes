package com.juniormeloDev.YouShoes.service;

import com.juniormeloDev.YouShoes.model.Produto;
import com.juniormeloDev.YouShoes.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository){
        this.repository=repository;
    }
   public List<Produto> create(Produto produto) {
       repository.save(produto);
       return null;
   }
  public List<Produto>read(){
       return repository.findAll();

   }
   public List<Produto> update(Produto produto){
       repository.save(produto);
       return null;
    }
    public List<Produto>delete(Long id){
        repository.deleteById(id);
        return null;
    }
}
