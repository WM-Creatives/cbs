package cbs.Customers.Models.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Flux<Contact> customerRelatedContacts(String customerUuis){
        return contactRepository.findByCustomerUuid(customerUuis);
    }
}
