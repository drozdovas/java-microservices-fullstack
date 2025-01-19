package com.drozdovas.microservices.order.repository;

import com.drozdovas.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
