package com.burhan.kodluyoruzBitirmeMyBank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;

@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue()
    @Column(name = "customer_id")
    private int id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String birth_place;
    private LocalDate registerDate;
    private long phoneNumber;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.REMOVE)
    private NormalAccount normalAccount;

/*
    @OneToMany(cascade = CascadeType.REMOVE)
    private Set<Account> accounts;

    @OneToMany
    private Set<CreditCard> creditCards;

    @OneToMany
    private Set<BankCard> bankCards;


 */


}
