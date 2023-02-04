package cbs.Customers.Models.Kins;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface KinRepository extends ReactiveCrudRepository<Kin, String> {
    Flux<Kin> findByCustomerUuid(String customerUuid);
}
