package com.terry.springbootmall.controller;

import com.terry.springbootmall.constant.ProductCategory;
import com.terry.springbootmall.dto.ProductQueryParams;
import com.terry.springbootmall.dto.ProductRequest;
import com.terry.springbootmall.model.Product;
import com.terry.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(
            //查詢條件Filtering
           @RequestParam (required = false)  ProductCategory category ,
           @RequestParam(required = false) String search,
          // 排序Sorting
          @RequestParam(defaultValue = "created_date") String orderBy,
           @RequestParam(defaultValue = "desc") String sort

    ){
        ProductQueryParams productQueryParams=new ProductQueryParams();
        productQueryParams.setCategory(category);
        productQueryParams.setSearch(search);
        productQueryParams.setOrderBy(orderBy);
        productQueryParams.setSort(sort);

        List<Product> productList= productService.getProducts(productQueryParams);

        return  ResponseEntity.status(HttpStatus.OK).body(productList);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
        Product product = productService.getProductById(productId);

        if (product != null) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productId,
                                                @RequestBody @Valid ProductRequest productRequest){
        //檢查product是否存在
        Product product=productService.getProductById(productId);

        if(product==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
       //修改商品的數據
        productService.updateProduct(productId,productRequest);

        Product updatedProduct=productService.getProductById(productId);

        return  ResponseEntity.status(HttpStatus.OK).body(updatedProduct);

    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest) {
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
@DeleteMapping("/products/{productId}")
    public  ResponseEntity<?>deleteProduct(@PathVariable Integer productId){
        productService.deleteProductById(productId);

        return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
