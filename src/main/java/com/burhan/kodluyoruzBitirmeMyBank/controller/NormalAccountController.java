package com.burhan.kodluyoruzBitirmeMyBank.controller.controller;
import com.burhan.kodluyoruzBitirmeMyBank.business.abstracts.NormalAccountService;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatNormalAccountRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateNormalAccountRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.NormalAccount;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/normalAccount")
@AllArgsConstructor

public class NormalAccountController {

    private NormalAccountService normalAccountService;



    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED) // 201 döndürsün diye
    public ResponseEntity<NormalAccount> add (@RequestBody @Valid CreatNormalAccountRequest creatNormalAccountRequest){
        NormalAccount normalAccount = normalAccountService.add(creatNormalAccountRequest);
        return ResponseEntity.ok(normalAccount);
    }


    @PutMapping
    void update (@RequestBody @Valid UpdateNormalAccountRequest updateNormalAccountRequest){
        normalAccountService.update(updateNormalAccountRequest);
    }

    @DeleteMapping("/{id}")
    void delete (@PathVariable @Valid UUID id){
        normalAccountService.delete(id);
    }





}
