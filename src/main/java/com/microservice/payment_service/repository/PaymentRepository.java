package com.microservice.payment_service.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.payment_service.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
