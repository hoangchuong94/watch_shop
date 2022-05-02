package com.codegym.watchshop.repository;

import com.codegym.watchshop.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {



    @Query(value = "SELECT p FROM Product p ORDER BY p.viewCount")
    List<Product> findAllProductViewCount();

    @Query(value = "SELECT p FROM Product p WHERE p.special = true")
    List<Product> findAllSpecial();

    @Query(value = "SELECT p FROM Product p ORDER BY p.unitPrice")
    List<Product> orderByViewCountAsc();

    @Query(value = "SELECT p FROM Product p ORDER BY p.unitPrice DESC ")
    List<Product> orderByViewCountDesc();

    @Query(value = "SELECT p FROM Product p ORDER BY p.id DESC ")
    List<Product> sortByProductIdDesc();
}
