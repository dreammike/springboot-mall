package com.terry.springbootmall.dao;

import com.terry.springbootmall.constant.ProductCategory;
import com.terry.springbootmall.dto.ProductQueryParams;
import com.terry.springbootmall.dto.ProductRequest;
import com.terry.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void deleteProductById(Integer productId);

    void updateProduct(Integer prodrctId,ProductRequest productRequest);

}
