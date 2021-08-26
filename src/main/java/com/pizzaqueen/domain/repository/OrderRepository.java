package com.pizzaqueen.domain.repository;

import com.pizzaqueen.domain.crud.OrderCrudRepository;
import com.pizzaqueen.domain.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class OrderRepository implements OrderRepo {
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    @Override
    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    @Override
    public Optional<Order> getOrder(int orderId) {
        return orderCrudRepository.findById(orderId);
    }

    @Override
    public Order save(Order order) {
        return orderCrudRepository.save(order);
    }

    @Override
    public void delete(int orderId) {
        orderCrudRepository.deleteById(orderId);
    }
}
