package com.terry.springbootmall.service.impl;

import com.terry.springbootmall.dao.ProductDao;
import com.terry.springbootmall.model.Product;
import com.terry.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServicelmpl implements ProductService {

@Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
       return  productDao.getProductById(productId);
    }
}
