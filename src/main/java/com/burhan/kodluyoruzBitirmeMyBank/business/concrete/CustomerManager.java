package com.burhan.kodluyoruzBitirmeMyBank.business.concrete;
import com.burhan.kodluyoruzBitirmeMyBank.business.abstracts.CustomerService;
import com.burhan.kodluyoruzBitirmeMyBank.common.ModelMapperService;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;
import com.burhan.kodluyoruzBitirmeMyBank.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    @Override
    public Customer add(CreatCustomerRequest creatCustomerRequest) {
        Customer customer = this.modelMapperService.forRequest().map(creatCustomerRequest,Customer.class);
        customer.setRegisterDate(LocalDate.now());
        return this.customerRepository.save(customer);
         /*
        Customer customer = new Customer();
        customer.setName(creatCustomerRequest.getName());
        customer.setSurname(creatCustomerRequest.getSurname());
        customer.setPhoneNumber(creatCustomerRequest.getPhoneNumber());
        customer.setBirth_place(creatCustomerRequest.getBirth_place());
        customer.setBirthDate(creatCustomerRequest.getBirth());
        customer.setRegisterDate(LocalDate.now());
        return  this.customerRepository.save(customer);
          */
    }

    @Override
    public void delete (int id) throws ResponseStatusException {
        Customer customer = customerRepository.getReferenceById(id);
        if (customer.getNormalAccount()!=null && customer.getNormalAccount().getSumMoney()!=0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST , "hesapta para var " );
        }

        this.customerRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCustomerRequest updateCustomerRequest) {
        Customer customer = this.modelMapperService.forRequest().map(updateCustomerRequest,Customer.class);
        int id = customer.getId();
        customer.setRegisterDate(customerRepository.getById(id).getRegisterDate());
        this.customerRepository.save(customer);
    }

}
