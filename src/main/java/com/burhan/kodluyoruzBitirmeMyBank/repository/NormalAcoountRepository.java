package com.burhan.kodluyoruzBitirmeMyBank.repository;
import com.burhan.kodluyoruzBitirmeMyBank.entity.Customer;
import com.burhan.kodluyoruzBitirmeMyBank.entity.NormalAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NormalAcoountRepository extends JpaRepository<NormalAccount, UUID> {


    void deleteById(UUID id);
}
