package com.terry.springbootmall.dto;

import com.terry.springbootmall.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory Category;
    private  String search;

    public ProductCategory getCategory() {
        return Category;
    }

    public void setCategory(ProductCategory category) {
        Category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
