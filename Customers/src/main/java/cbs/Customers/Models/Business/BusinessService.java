package cbs.Customers.Models.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BusinessService {
    @Autowired
    private BusinessRepository businessRepository;

    public Flux<Business> customerRelatedBusiness(String customerUuis){
        return businessRepository.findByCustomerUuid(customerUuis);
    }
}
