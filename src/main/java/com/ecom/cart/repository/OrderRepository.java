package com.ecom.cart.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ecom.cart.model.Order;

public interface OrderRepository extends ReactiveMongoRepository<Order,Long> {
}
