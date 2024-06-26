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
public class CreatCustomerRequest {

    @NotNull
    @NotBlank
    @Size (min=2, max=30)
    private String name;

    @NotNull
    @NotBlank
    @Size (min=2, max=30)
    private String surname;

    @NotNull
    private LocalDate birth;

    @NotNull
    @Size (min=2, max=30)
    private String birth_place;

    @NotNull
    private long phoneNumber;



}
