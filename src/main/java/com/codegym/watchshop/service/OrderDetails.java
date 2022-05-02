package com.codegym.watchshop.service;

import com.codegym.watchshop.repository.IOrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class OrderDetails implements IOrderDetailsService{

    @Autowired
    IOrderDetailsRepository orderDetailsRepository;
    @Override
    public Iterable<com.codegym.watchshop.model.OrderDetails> findAll() {
        return orderDetailsRepository.findAll();
    }

    @Override
    public Optional<com.codegym.watchshop.model.OrderDetails> findById(Long id) {
        return orderDetailsRepository.findById(id);
    }

    @Override
    public void save(com.codegym.watchshop.model.OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    @Override
    public void remove(Long id) {
        orderDetailsRepository.deleteById(id);
    }
}
