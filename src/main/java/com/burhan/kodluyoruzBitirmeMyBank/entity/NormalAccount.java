package com.burhan.kodluyoruzBitirmeMyBank.entity;
import com.burhan.kodluyoruzBitirmeMyBank.common.CurrencyEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Table(name="normalAccount")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NormalAccount {

    @Id
    @GeneratedValue
    @Size (min=26, max=26)
    @Column(name = "iban")
    private UUID iban;

    private double sumMoney=0;

    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;

    @OneToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    /*
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "costumer_id")
    private Customer customer;
    @OneToOne(mappedBy = "account",cascade = CascadeType.REMOVE)
    private CreditCard creditCard;
    @OneToOne(mappedBy = "account",cascade = CascadeType.REMOVE)
    private BankCard bankCard;
     */

}
