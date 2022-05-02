package com.codegym.watchshop.controller;

import com.codegym.watchshop.model.Category;
import com.codegym.watchshop.model.Product;
import com.codegym.watchshop.service.ICategoryService;
import com.codegym.watchshop.service.IOrderDetailsService;
import com.codegym.watchshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    IProductService productService;

    @Autowired
    ICategoryService categoryService;

    @GetMapping
    public ModelAndView listProducts() {
        List<Product> products = (List<Product>) productService.findAll();
        List<Category> categories = (List<Category>) categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/product");
        modelAndView.addObject("categorys", categories);
        modelAndView.addObject("products", products);
        return modelAndView;
    }



}
