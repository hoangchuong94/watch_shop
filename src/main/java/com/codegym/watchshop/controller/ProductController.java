package com.codegym.watchshop.controller;

import com.codegym.watchshop.model.Product;
import com.codegym.watchshop.service.ICategoryService;
import com.codegym.watchshop.service.IOrderDetailsService;
import com.codegym.watchshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @Autowired
    ICategoryService categoryService;

    @GetMapping("/new")
    public ModelAndView newProduct() {
        List<Product> products = productService.sortByProductIdDesc();
        ModelAndView modelAndView = new ModelAndView("/customer/product");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
    @GetMapping("/special")
    public ModelAndView Special() {
        List<Product> products = productService.findAllSpecial();
        ModelAndView modelAndView = new ModelAndView("/customer/product");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/viewscount")
    public ModelAndView fromHighToLow() {
        List<Product> products = productService.findAllProductViewCount();
        ModelAndView modelAndView = new ModelAndView("/customer/product");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/tallest")
    public ModelAndView unitPriceTallest() {
        List<Product> products = productService.orderByViewCountDesc();
        ModelAndView modelAndView = new ModelAndView("/customer/product");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/cheapest")
    public ModelAndView unitPriceCheapest() {
        List<Product> products = productService.orderByViewCountAsc();
        ModelAndView modelAndView = new ModelAndView("/customer/product");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
