package cbs.Customers.Models.Kins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class KinsService {
    @Autowired
    private KinRepository kinRepository;

    public Flux<Kin> customerRelatedKins(String customerUuid){
        return kinRepository.findByCustomerUuid(customerUuid);
    }
}
