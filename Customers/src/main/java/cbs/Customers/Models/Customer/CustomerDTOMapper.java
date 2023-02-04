package cbs.Customers.Models.Customer;

import cbs.Customers.DTO.CustomerDTO;
import cbs.Customers.Models.Business.BusinessService;
import cbs.Customers.Models.Contact.ContactService;
import cbs.Customers.Models.Kins.KinsService;
import cbs.Customers.Models.Referees.RefereeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CustomerDTOMapper implements Function<Customer, CustomerDTO> {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private KinsService kinsService;

    @Autowired
    private RefereeService refereeService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private ContactService contactService;

    @Override
    public CustomerDTO apply(Customer customer) {
        return CustomerDTO.builder()
                .dob(customer.getDob())
                .kin(kinsService.customerRelatedKins(customer.getId()))
                .pin(customer.getPin())
                .identityNo(customer.getIdentityNo())
                .middleName(customer.getMiddleName())
                .title(customer.getTitle())
                .nationality(customer.getNationality())
                .referee(refereeService.customerRelatedReferees(customer.getId()))
                .contact(contactService.customerRelatedContacts(customer.getId()))
                .surname(customer.getSurname())
                .maritalStatus(customer.getMaritalStatus())
                .firstName(customer.getFirstName())
                .business(businessService.customerRelatedBusiness(customer.getId()))
                .occupation(customer.getOccupation())
                .build();
    }
}
