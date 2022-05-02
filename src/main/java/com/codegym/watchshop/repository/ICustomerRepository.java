package com.codegym.watchshop.repository;

import com.codegym.watchshop.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
