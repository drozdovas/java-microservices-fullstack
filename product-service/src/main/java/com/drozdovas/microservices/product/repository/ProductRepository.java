package com.drozdovas.microservices.product.repository;

import com.drozdovas.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
