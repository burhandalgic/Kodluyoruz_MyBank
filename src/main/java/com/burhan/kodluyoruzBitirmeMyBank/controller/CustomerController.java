package com.burhan.kodluyoruzBitirmeMyBank.controller;
import com.burhan.kodluyoruzBitirmeMyBank.business.abstracts.CustomerService;
import com.burhan.kodluyoruzBitirmeMyBank.common.ModelMapperService;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor

public class CustomerController {

    private CustomerService customerService;



    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED) // 201 döndürsün diye
    public ResponseEntity<Customer> add (@RequestBody @Valid CreatCustomerRequest creatCustomerRequest){
        Customer customer = customerService.add(creatCustomerRequest);
        return ResponseEntity.ok(customer);
    }


    @PutMapping
    void update (@RequestBody @Valid UpdateCustomerRequest updateCustomerRequest){
        customerService.update(updateCustomerRequest);
    }

    @DeleteMapping("/{id}")
    void delete (@PathVariable @Valid int id) throws JsonProcessingException
    {
        customerService.delete(id);
    }





}
