package cbs.Accounts.Models.Accounts;

import cbs.Accounts.DTO.AccountInformation;
import reactor.core.publisher.Mono;

public interface AccountOperations {
    Mono<Account> openAccount(Account account);
    Mono<Account> closeAccount();
    Mono<Account> updateAccountInformation(Account account);
    Mono<Account> deleteAccount();
    Double calaculateInterest();
}
