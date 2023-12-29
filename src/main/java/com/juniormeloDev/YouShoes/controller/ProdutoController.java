package com.juniormeloDev.YouShoes.controller;

import com.juniormeloDev.YouShoes.model.Produto;
import com.juniormeloDev.YouShoes.repository.ProdutoRepository;
import com.juniormeloDev.YouShoes.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    List<Produto> listAll(Produto produto) {
        return service.read();
    }

    @PostMapping
    List<Produto> save(@RequestBody Produto produto) {
        return service.create(produto);
    }

    @PutMapping
    List<Produto> update(@RequestBody Produto produto) {
        return service.update(produto);
    }

    @DeleteMapping("/{id}")
    List<Produto> delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    }

