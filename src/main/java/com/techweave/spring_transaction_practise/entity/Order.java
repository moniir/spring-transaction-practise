package com.techweave.spring_transaction_practise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private int id;
    private int productId;
    private int quantity;
    private double totalPrice;

}
