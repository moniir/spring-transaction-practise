package com.techweave.spring_transaction_practise.repository;

import com.techweave.spring_transaction_practise.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
