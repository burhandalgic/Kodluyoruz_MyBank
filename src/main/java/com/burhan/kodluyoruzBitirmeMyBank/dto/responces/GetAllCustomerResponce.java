package com.burhan.kodluyoruzBitirmeMyBank.dto.responces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomerResponce {
    private int id ;
    private String name;
}
