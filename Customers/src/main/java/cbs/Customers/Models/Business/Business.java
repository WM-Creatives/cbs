package cbs.Customers.Models.Business;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data @Builder
@Table(name = "biashara")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String mobileNo;
    private String emailAddress;
    private String boxNo;
    private String postalCode;
    private Point location;
    private Boolean isRegistered;
    private String businessName;
    private String businessType;
    private Date registrationDate;
    private String registrationNo;
    @Column(name = "customer_uuid")
    private String customerUUID;

}
