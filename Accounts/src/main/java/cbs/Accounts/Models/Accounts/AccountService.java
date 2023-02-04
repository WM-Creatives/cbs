package cbs.Accounts.Models.Accounts;

import cbs.Accounts.DTO.AccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AccountService implements AccountOperations{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Mono<Account> openAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Account> closeAccount() {
        return null;
    }

    @Override
    public Mono<Account> updateAccountInformation(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Mono<Account> deleteAccount() {
        return null;
    }

    @Override
    public Double calaculateInterest() {
        return null;
    }
}
