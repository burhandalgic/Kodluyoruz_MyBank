package com.burhan.kodluyoruzBitirmeMyBank.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {

    private int id;

    @Size (min=2, max=30)
    private String name;


    @Size (min=2, max=30)
    private String surname;

    private LocalDate birth;

    @Size (min=2, max=30)
    private String birth_place;

    private long phoneNumber;


}
