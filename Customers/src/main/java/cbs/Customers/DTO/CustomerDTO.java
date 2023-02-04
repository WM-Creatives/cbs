package cbs.Customers.DTO;

import cbs.Customers.Models.Business.Business;
import cbs.Customers.Models.Contact.Contact;
import cbs.Customers.Models.Kins.Kin;
import cbs.Customers.Models.Referees.Referee;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import reactor.core.publisher.Flux;

import java.util.Date;

@Data @Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {
    private String firstName;
    private String middleName;
    private String surname;
    private String title;
    private String nationality;
    private Date dob;
    private String identityNo;
    private String maritalStatus;

    private String occupation;
    private Flux<Business> business;
    private Flux<Kin> kin;
    private Flux<Referee> referee;
    private Flux<Contact> contact;

    private String pin;
}
