package cbs.Accounts.Utils.Mapppers;

import cbs.Accounts.DTO.AccountInformation;
import cbs.Accounts.Models.Accounts.Account;
import cbs.Accounts.Models.Accounts.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ToAccountMapper implements Function<AccountInformation, Account> {
    private final AccountRepository accountRepository;

    public ToAccountMapper(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account apply(AccountInformation accountInformation) {
        return Account.builder()
                .postedTime(accountInformation.getPostedTime())
                .accountmanger(accountInformation.getAccountmanger())
                .accountOwnership(accountInformation.getAccountOwnership())
                .accountStatus(accountInformation.getAccountStatus())
                .balance(accountInformation.getBalance())
                .sn(accountInformation.getSn())
                .name(accountInformation.getName())
                .closedBy(accountInformation.getClosedBy())
                .closedTime(accountInformation.getClosedTime())
                .customerSn(accountInformation.getCustomerSn())
                .ledger(accountInformation.getLedger())
                .migrated(accountInformation.getMigrated())
                .modifiedBy(accountInformation.getModifiedBy())
                .modifiedTime(accountInformation.getModifiedTime())
                .postedBy(accountInformation.getPostedBy())
                .schemeCode(accountInformation.getSchemeCode())
                .solCode(accountInformation.getSolCode())
                .verifiedBy(accountInformation.getVerifiedBy())
                .verifiedTime(accountInformation.getVerifiedTime())
                .acid(accountInformation.getAcid())
                .groupSn(accountInformation.getGroupSn())
                .build();
    }
}
