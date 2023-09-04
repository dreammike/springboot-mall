package com.terry.springbootmall.dao;

import com.terry.springbootmall.dto.ProductRequest;
import com.terry.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void deleteProductById(Integer productId);

    void updateProduct(Integer prodrctId,ProductRequest productRequest);

}
