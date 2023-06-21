package com.MedicareBackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.MedicareBackend.Model.Medicine;
import com.MedicareBackend.Model.Order;
import com.MedicareBackend.Repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderrepo;
	
	public Order addOrder(Order order) {
		return orderrepo.save(order);
	}
	
	
}
