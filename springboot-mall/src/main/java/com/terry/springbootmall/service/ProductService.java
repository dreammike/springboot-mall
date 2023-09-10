package com.terry.springbootmall.service;

import com.terry.springbootmall.dto.ProductQueryParams;
import com.terry.springbootmall.dto.ProductRequest;
import com.terry.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void deleteProductById(Integer productId);

    void updateProduct(Integer prodrctId,ProductRequest productRequest);
}
