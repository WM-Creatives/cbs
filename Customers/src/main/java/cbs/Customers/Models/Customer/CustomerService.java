package cbs.Customers.Models.Customer;

import cbs.Customers.DTO.CustomerDTO;
import cbs.Customers.Exceptions.PhoneNumberAlreadyUsed;
import cbs.Customers.Models.Business.BusinessRepository;
import cbs.Customers.Models.Contact.ContactRepository;
import cbs.Customers.Models.Kins.Kin;
import cbs.Customers.Models.Kins.KinRepository;
import cbs.Customers.Models.Referees.RefereeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BusinessRepository businessRepository;

    @Autowired
    private KinRepository kinRepository;

    @Autowired
    private RefereeRepository refereeRepository;

    @Autowired
    private ContactRepository contactRepository;

    private Mono<Boolean> checkifIdAndPinUsed(String id, String pin){
        return customerRepository.existsByIdentityNoOrPin(id, pin);
    }

    public Mono<CustomerDTO> saveCustomer(CustomerDTO pojo){
        Mono<Customer> customerMono = checkifIdAndPinUsed(pojo.getIdentityNo(), pojo.getPin())
                .flatMap(exists -> {
                    if(exists){
                        return Mono.error(PhoneNumberAlreadyUsed::new);
                    } else {
                        return customerRepository.save(CustomerMapper.INSTANCE.toEntity(pojo));
                    }
                });
        String uuid = Objects.requireNonNull(customerMono.block()).getId();
        return null;
    }
}
