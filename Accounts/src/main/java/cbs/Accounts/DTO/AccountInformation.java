package cbs.Accounts.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class AccountInformation {
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
    private String acid;
    private String customerSn;
    private String groupSn;
}
