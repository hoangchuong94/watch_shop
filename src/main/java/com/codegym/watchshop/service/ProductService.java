package com.codegym.watchshop.service;

import com.codegym.watchshop.model.Product;
import com.codegym.watchshop.repository.IProductRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;


    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepository.findById(id);
    }


    @Override
    public List<Product> findAllProductViewCount() {
       return productRepository.findAllProductViewCount();
    }

    @Override
    public List<Product> findAllSpecial() {
        return productRepository.findAllSpecial();
    }

    @Override
    public List<Product> orderByViewCountAsc() {
        return productRepository.orderByViewCountAsc();
    }

    @Override
    public List<Product> sortByProductIdDesc() {
        return productRepository.sortByProductIdDesc();
    }

    @Override
    public List<Product> orderByViewCountDesc() {
        return productRepository.orderByViewCountDesc();
    }


}
