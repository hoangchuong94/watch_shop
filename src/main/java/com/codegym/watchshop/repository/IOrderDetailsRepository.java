package com.codegym.watchshop.repository;

import com.codegym.watchshop.model.OrderDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDetailsRepository extends PagingAndSortingRepository<OrderDetails, Long> {
}
