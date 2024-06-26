package com.burhan.kodluyoruzBitirmeMyBank.repository;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {




}
