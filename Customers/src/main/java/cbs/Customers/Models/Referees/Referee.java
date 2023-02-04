package cbs.Customers.Models.Referees;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data @Builder
@Table(name = "referees")
public class Referee {
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
    private String relationship;
    @Column(name = "customer_uuid")
    private String customerUUID;
}
