package com.ecom.cart.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ecom.cart.model.OrderDetails;


public interface OrderDetailsRepository extends ReactiveMongoRepository<OrderDetails,Long> {
}
