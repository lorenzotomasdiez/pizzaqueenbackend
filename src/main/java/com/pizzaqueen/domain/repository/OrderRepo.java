package com.pizzaqueen.domain.repository;

import com.pizzaqueen.domain.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepo {
    List<Order> getAll();
    Optional<Order> getOrder(int orderId);
    Order save(Order order);
    void delete(int orderId);
}
