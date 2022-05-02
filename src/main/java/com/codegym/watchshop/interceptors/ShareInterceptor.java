//package com.codegym.watchshop.interceptors;
//
//import com.codegym.watchshop.model.Category;
//import com.codegym.watchshop.service.ICategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
//@Component
//public class ShareInterceptor implements HandlerInterceptor {
//
//    @Autowired
//    ICategoryService iCategoryService;
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        List<Category> categories = (List<Category>) iCategoryService.findAll();
//        assert modelAndView != null;
//        modelAndView.addObject("categories", categories);
//
//    }
//}
