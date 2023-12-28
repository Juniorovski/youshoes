package com.juniormeloDev.YouShoes.controller;

import com.juniormeloDev.YouShoes.model.Produto;
import com.juniormeloDev.YouShoes.repository.ProdutoRepository;
import com.juniormeloDev.YouShoes.service.ProdutoService;
import com.juniormeloDev.YouShoes.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

    @Autowired
    private StockService stockService;

    @PostMapping("/sale")
    public ResponseEntity<String>
    saleProduto(@RequestParam Long produtoId, @RequestParam int amount) {
        try {
            Optional<Produto> optionalProduto = produtoRepository.findById(produtoId);
            if (optionalProduto.isPresent()) {
                Produto produto = optionalProduto.get();
                stockService.makeSales(produto, amount);
                return ResponseEntity.ok("Venda realizada com sucesso!");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto Not found!");
            }
        } catch (Exception e) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to make sale!");
        }
        return null;
    }
}
