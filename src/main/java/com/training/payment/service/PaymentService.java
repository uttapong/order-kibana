package com.training.payment.service;

import com.training.payment.model.PaymentRequest;
import com.training.payment.model.PaymentResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        // Process the payment (mocked logic here)
        PaymentResponse response = new PaymentResponse();
        response.setStatus("SUCCESS");
        response.setMessage("Payment processed successfully.");
        response.setTransactionId(UUID.randomUUID().toString());
        
        return response;
    }
}
