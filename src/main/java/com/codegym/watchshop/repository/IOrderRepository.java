package com.codegym.watchshop.repository;

import com.codegym.watchshop.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends PagingAndSortingRepository<Order, Long> {
}
