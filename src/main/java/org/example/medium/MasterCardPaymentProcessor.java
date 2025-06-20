package org.example.medium;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Qualifier("mastercard")
public class MasterCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(BigDecimal d) {
        System.out.println("Оплачено через MasterCard карту: " + d);
    }
}