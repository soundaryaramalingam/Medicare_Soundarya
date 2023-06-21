package com.MedicareBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicareBackend.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
