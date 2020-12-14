package com.jvision.admin201918010.domain.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p from Posts p ORDER BY p.id Desc")
    List<Posts> findAllDesc();

}
