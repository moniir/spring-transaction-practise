package com.techweave.spring_transaction_practise.repository;

import com.techweave.spring_transaction_practise.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
