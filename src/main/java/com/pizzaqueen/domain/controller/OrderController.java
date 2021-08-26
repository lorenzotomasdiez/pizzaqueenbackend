package com.pizzaqueen.domain.controller;

import com.pizzaqueen.domain.entity.Order;
import com.pizzaqueen.domain.service.OrderService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAll(){
        return new ResponseEntity(orderService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity getOrder(@PathVariable("orderId") int orderId){
        return (ResponseEntity)orderService.getOrder(orderId).map(
                order -> {
                    return new ResponseEntity(order, HttpStatus.OK);
                }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Order> save(@RequestBody Order order){
        return new ResponseEntity(orderService.save(order), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{orderId}")
    public ResponseEntity delete(@PathVariable("orderId") int orderId){
        return orderService.delete(orderId)
                ? new ResponseEntity(HttpStatus.OK)
                : new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
