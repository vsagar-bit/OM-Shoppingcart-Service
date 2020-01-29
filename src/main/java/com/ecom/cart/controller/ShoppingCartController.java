package com.ecom.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.cart.service.ShoppingCartService;

@RestController
@RequestMapping(name = "/cart")
public class ShoppingCartController {

	@Autowired
	ShoppingCartService cartService;
	
}
