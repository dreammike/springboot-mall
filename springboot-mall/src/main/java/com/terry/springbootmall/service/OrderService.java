package com.terry.springbootmall.service;

import com.terry.springbootmall.dto.CreateOrderRequest;
import com.terry.springbootmall.dto.OrderQueryParams;
import com.terry.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

     Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
