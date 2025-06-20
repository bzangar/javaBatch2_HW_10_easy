package org.example.medium;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
@Qualifier("visa")
public class VisaCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(BigDecimal d) {
        System.out.println("Оплачено через Visa карту: " + d);
    }
}
