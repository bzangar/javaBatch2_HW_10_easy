package org.example.medium_hard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {

    @Autowired
    @Qualifier("plovcoin")
    private PaymentProcessor paymentProcessor;


    public void makeOrder(BigDecimal d){
        paymentProcessor.processPayment(d);
    }
}
