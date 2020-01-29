package com.ecom.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.cart.repository.OrderDetailsRepository;
import com.ecom.cart.repository.OrderRepository;

@Service
public class ShoppingCartService {

	@Autowired
	OrderDetailsRepository orderDetailsRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	
}
