package cbs.Customers.Models.Business;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface BusinessRepository extends ReactiveCrudRepository<Business, String> {
    Flux<Business> findByCustomerUuid(String customerUuid);
}
