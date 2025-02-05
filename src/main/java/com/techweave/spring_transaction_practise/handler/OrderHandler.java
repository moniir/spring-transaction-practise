package com.techweave.spring_transaction_practise.handler;

import com.techweave.spring_transaction_practise.entity.Order;
import com.techweave.spring_transaction_practise.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderHandler {
    private final OrderRepository orderRepository;

    public OrderHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
