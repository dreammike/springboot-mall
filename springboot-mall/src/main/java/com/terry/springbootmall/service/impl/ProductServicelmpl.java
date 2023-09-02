package com.terry.springbootmall.service.impl;

import com.terry.springbootmall.dao.ProductDao;
import com.terry.springbootmall.dto.ProductRequest;
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

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }

    @Override
    public void updateProduct(Integer prodrctId, ProductRequest productRequest) {
        productDao.updateProduct(prodrctId,productRequest);
    }
}
