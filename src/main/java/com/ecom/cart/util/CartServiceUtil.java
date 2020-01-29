package com.ecom.cart.util;


import org.springframework.beans.BeanUtils;

import com.ecom.cart.dto.CheckoutDetailsDTO;
import com.ecom.cart.model.Order;

public class CartServiceUtil {

	public static Order getOrderFromCheckoutDetails(CheckoutDetailsDTO dto) {
		Order order = new Order();
		BeanUtils.copyProperties(dto, order);
		return order;
	}
	
	
}
