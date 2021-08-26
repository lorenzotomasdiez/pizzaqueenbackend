package com.pizzaqueen.domain.service;

import com.pizzaqueen.domain.entity.Order;
import com.pizzaqueen.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {

        return (List<Order>) orderRepository.getAll();
    }

    public Optional<Order> getOrder(int orderId) {

        return orderRepository.getOrder(orderId);
    }

    public Order save(Order order) {

        return orderRepository.save(order);
    }

    public boolean delete(int orderId) {
        return getOrder(orderId).map(
                order -> {
                    orderRepository.delete(orderId);
                    return true;
                }).orElse(false);
    }
}
