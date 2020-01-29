package com.ecom.cart.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ecom.cart.model.OrderStatus;

public interface OrderStatusRepository extends ReactiveMongoRepository<OrderStatus,Long> {

}
