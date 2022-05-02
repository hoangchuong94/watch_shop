package com.codegym.watchshop.service;

import com.codegym.watchshop.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IProductService extends IGeneralService<Product> {
    List<Product> findAllProductViewCount();

    List<Product> findAllSpecial();

    List<Product> orderByViewCountAsc();

    List<Product> sortByProductIdDesc();

    List<Product> orderByViewCountDesc();

}
