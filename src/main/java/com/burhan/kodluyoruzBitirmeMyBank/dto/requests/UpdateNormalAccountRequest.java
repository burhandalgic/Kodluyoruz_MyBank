package com.burhan.kodluyoruzBitirmeMyBank.dto.requests;

import com.burhan.kodluyoruzBitirmeMyBank.common.CurrencyEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class CreatNormalAccountRequest {

    @NotNull
    @NotBlank
    private double sumMoney=0;

    @NotNull
    @NotBlank
    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;





}
