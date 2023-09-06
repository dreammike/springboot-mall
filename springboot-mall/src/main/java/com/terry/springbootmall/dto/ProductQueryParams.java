package com.terry.springbootmall.dto;

import com.terry.springbootmall.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory Category;
    private  String search;
    private  String orderBy;
    private  String sort;

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

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
