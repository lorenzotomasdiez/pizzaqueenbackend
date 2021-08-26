package com.pizzaqueen.domain.crud;

import com.pizzaqueen.domain.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderCrudRepository extends CrudRepository<Order,Integer> {

}
