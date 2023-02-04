package cbs.Accounts.Models.Accounts;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String sn;
    private Date postedTime;
    private Date postedBy;
    private Date verifiedTime;
    private String verifiedBy;
    private Date modifiedTime;
    private String modifiedBy;
    private String name;
    private Character accountStatus;
    private Double balance;
    private String accountOwnership;
    private String schemeCode;
    private String solCode;
    private String ledger; //GL subhead
    private Date closedTime;
    private String closedBy;
    private Boolean migrated;
    private String accountmanger;
    private String customerSn;
    private String groupSn;
    private String acid;
}
