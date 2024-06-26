package com.burhan.kodluyoruzBitirmeMyBank.business.abstracts;

import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;

public interface CustomerService {

    Customer addCustomer(CreatCustomerRequest creatCustomerRequest);
    void delete (int id);
    void update (UpdateCustomerRequest updateCustomerRequest);

}
