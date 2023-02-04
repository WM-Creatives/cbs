package cbs.Accounts.Resources;

import cbs.Accounts.DTO.AccountInformation;
import cbs.Accounts.DTO.ResponseTemplate;
import cbs.Accounts.Models.Accounts.Account;
import cbs.Accounts.Models.Accounts.AccountRepository;
import cbs.Accounts.Models.Accounts.AccountService;
import cbs.Accounts.Utils.Mapppers.AccountDTOMapper;
import cbs.Accounts.Utils.Mapppers.ToAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("v1/accounts")
public class AccountsResource {
    @Autowired
    private AccountService accountsService;

    @Autowired
    private AccountDTOMapper accountDTOMapper;

    @Autowired
    private ToAccountMapper toAccountMapper;
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("open")
    public ResponseEntity<?> openAccount(@RequestBody AccountInformation accountInformation){
        Account account = toAccountMapper.apply(accountInformation);
        Mono<Account> savedAccount = accountsService.openAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(Mono.just(ResponseTemplate.builder()
                        .data(savedAccount)
                        .httpStatus(HttpStatus.CREATED.value())
                        .message("Account Created Successfully")
                .build()));
    }

    @PutMapping("update")
    public ResponseEntity<?> updateAccountInformations(@RequestBody AccountInformation information){
        Account account = toAccountMapper.apply(information);
        Mono<Account> updatedAccount = accountsService.openAccount(account);
        return ResponseEntity.status(HttpStatus.OK).body(Mono.just(ResponseTemplate.builder()
                .data(updatedAccount)
                .httpStatus(HttpStatus.OK.value())
                .message("Account Information Updated Successfully")
                .build()));
    }
}
