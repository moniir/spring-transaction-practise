package com.techweave.spring_transaction_practise.handler;

import com.techweave.spring_transaction_practise.entity.Product;
import com.techweave.spring_transaction_practise.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductHandler {
    private final ProductRepository productRepository;

    public ProductHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Product updateProductDetails(Product product) {

        //forcefully throwing exception to simulate use of tx
        if(product.getPrice() > 5000){
            throw new RuntimeException("DB crashed.....");
        }
        return productRepository.save(product);
    }


    public Product getProduct(int id) {
        return productRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Product not available with id : " + id)
                );
    }
}
