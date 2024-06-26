package com.burhan.kodluyoruzBitirmeMyBank.business.concrete;
import com.burhan.kodluyoruzBitirmeMyBank.business.abstracts.NormalAccountService;
import com.burhan.kodluyoruzBitirmeMyBank.common.ModelMapperService;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.CreatNormalAccountRequest;
import com.burhan.kodluyoruzBitirmeMyBank.dto.requests.UpdateNormalAccountRequest;
import com.burhan.kodluyoruzBitirmeMyBank.entity.NormalAccount;
import com.burhan.kodluyoruzBitirmeMyBank.repository.CustomerRepository;
import com.burhan.kodluyoruzBitirmeMyBank.repository.NormalAcoountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@AllArgsConstructor
public class NormalAccountManager implements NormalAccountService {

    private NormalAcoountRepository normalAcoountRepository;
    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;

    @Override
    public NormalAccount add(CreatNormalAccountRequest creatNormalAccountRequest) {
        NormalAccount normalAccount = this.modelMapperService.forRequest().map(creatNormalAccountRequest,NormalAccount.class);
        normalAccount.setCustomer( customerRepository.getReferenceById(creatNormalAccountRequest.getCustomer_id()));
        return this.normalAcoountRepository.save(normalAccount);
    }

    @Override
    public void delete(UUID id) {
        this.normalAcoountRepository.deleteById(id);
    }

    @Override
    public void update( UpdateNormalAccountRequest updateNormalAccountRequest ) {
        NormalAccount normalAccount = this.modelMapperService.forRequest().map(updateNormalAccountRequest,NormalAccount.class);
        this.normalAcoountRepository.save(normalAccount);
    }

}



