package com.fleximart.repository;


import com.fleximart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryId(String categoryId);
    List<Category> findByLevel(Integer level);

}
