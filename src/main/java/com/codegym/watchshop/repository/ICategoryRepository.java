package com.codegym.watchshop.repository;

import com.codegym.watchshop.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
