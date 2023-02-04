package cbs.Customers.Models.Contact;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ContactRepository extends ReactiveCrudRepository<Contact, String> {
    Flux<Contact> findByCustomerUuid(String customerUuid);
}
