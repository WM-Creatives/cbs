package cbs.Customers.Models.Kins;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.data.annotation.Id;

@Data @Builder
@Table(name = "kins")
public class Kin {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String mobileNo;
    private String emailAddress;
    private String boxNo;
    private String postalCode;
    private String occupation;
    @Column(name = "customer_uuid")
    private String customerUUID;

}
