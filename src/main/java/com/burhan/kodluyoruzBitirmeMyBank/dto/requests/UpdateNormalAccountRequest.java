package com.burhan.kodluyoruzBitirmeMyBank.dto.requests;

import com.burhan.kodluyoruzBitirmeMyBank.common.CurrencyEnum;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateNormalAccountRequest {


    private UUID iban;

    private double sumMoney=0;

    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;

    private int customer_id;





}
