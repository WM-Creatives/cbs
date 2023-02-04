package cbs.Customers.Models.Referees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class RefereeService {
    @Autowired
    private RefereeRepository refereeRepository;

    public Flux<Referee> customerRelatedReferees(String customerUuid){
        return refereeRepository.findByCustomerUuid(customerUuid);
    }
}
