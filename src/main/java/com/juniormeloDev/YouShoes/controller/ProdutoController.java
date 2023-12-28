package com.juniormeloDev.YouShoes.controller;

import com.juniormeloDev.YouShoes.model.Produto;
import com.juniormeloDev.YouShoes.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
  private ProdutoService service;
    public ProdutoController(ProdutoService service){
        this.service=service;
    }
  @GetMapping
    List<Produto>listAll(Produto produto){
        return service.read();
  }
  @PostMapping
    List<Produto>save(@RequestBody Produto produto){
        return service.create(produto);
  }
  @PutMapping
    List<Produto>update(@RequestBody Produto produto){
        return service.update(produto);
  }
  @DeleteMapping("/{id}")
    List<Produto>delete(@PathVariable ("id")Long id){
        return service.delete(id);
  }
}
