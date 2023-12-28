package com.juniormeloDev.YouShoes.repository;

import com.juniormeloDev.YouShoes.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
