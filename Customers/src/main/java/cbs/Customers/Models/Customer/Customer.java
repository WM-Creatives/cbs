package cbs.Customers.Models.Customer;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data @Builder
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String firstName;
    private String middleName;
    private String surname;
    private String title;
    private String nationality;
    private Date dob;
    private String identityNo;
    private String maritalStatus;

    private String occupation;
    private String pin;

}
