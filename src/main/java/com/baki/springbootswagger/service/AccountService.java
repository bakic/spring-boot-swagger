package com.baki.springbootswagger.service;

import com.baki.springbootswagger.dto.AccountDto;
import com.baki.springbootswagger.exception.AccountNotFoundException;
import com.baki.springbootswagger.model.Account;
import com.baki.springbootswagger.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    /**
     * Get an account.
     *
     * @param id The identifier of the account
     * @return The account found
     */
    public AccountDto getAccount(final Long id) {
        try {
            Account account = accountRepository.getOne(id);
            return AccountDto.builder()
                    .firstName(account.getFirstName())
                    .lastName(account.getLastName())
                    .email(account.getEmail())
                    .dateOfBirth(account.getDateOfBirth())
                    .build();
        } catch (EntityNotFoundException exception) {
            throw new AccountNotFoundException("Account with ID= " + id + " not found");
        }
    }

    /**
     * List all the accounts.
     *
     * @return A list of accounts
     */
    public List<Account> fetchAccounts() {
        return accountRepository.findAll();
    }

    /**
     * Create a new account.
     *
     * @param accountDto An account to persist
     * @return The account created
     */
    public Account createAccount(AccountDto accountDto) {

        Account account = new Account();
        account.setFirstName(accountDto.getFirstName());
        account.setLastName(accountDto.getLastName());
        account.setEmail(accountDto.getEmail());
        account.setDateOfBirth(account.getDateOfBirth());

        return accountRepository.save(account);
    }

}
