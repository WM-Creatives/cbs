package cbs.Accounts.Utils.Mapppers;

import cbs.Accounts.DTO.AccountInformation;
import cbs.Accounts.Models.Accounts.Account;

import java.util.function.Function;

public class AccountDTOMapper implements Function<Account, AccountInformation> {
    @Override
    public AccountInformation apply(Account account) {
        return AccountInformation.builder()
                .sn(account.getSn())
                .postedTime(account.getPostedTime())
                .accountOwnership(account.getAccountOwnership())
                .accountStatus(account.getAccountStatus())
                .balance(account.getBalance())
                .accountmanger(account.getAccountmanger())
                .name(account.getName())
                .closedBy(account.getClosedBy())
                .modifiedBy(account.getModifiedBy())
                .closedTime(account.getClosedTime())
                .ledger(account.getLedger())
                .customerSn(account.getCustomerSn())
                .modifiedTime(account.getModifiedTime())
                .postedBy(account.getPostedBy())
                .migrated(account.getMigrated())
                .solCode(account.getSolCode())
                .verifiedBy(account.getAccountmanger())
                .verifiedTime(account.getVerifiedTime())
                .schemeCode(account.getSchemeCode())
                .acid(account.getAcid())
                .groupSn(account.getGroupSn())
                .build();
    }
}
