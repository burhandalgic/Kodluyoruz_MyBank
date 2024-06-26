package com.burhan.kodluyoruzBitirmeMyBank.business.abstracts;

import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatNormalAccountRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateCustomerRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateNormalAccountRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;
import com.burhan.kodluyoruzBitirmeMyBank.entity.NormalAccount;

import java.util.UUID;

public interface NormalAccountService {



    NormalAccount add (CreatNormalAccountRequest creatNormalAccountRequest);

    void delete (UUID id);
    void update (UpdateNormalAccountRequest updateNormalAccountRequest);

}
