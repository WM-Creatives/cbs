package cbs.Customers.Models.Referees;

import lombok.Data;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface RefereeRepository extends ReactiveCrudRepository<Referee, String> {
    Flux<Referee> findByCustomerUuid(String customerUuid);
}
