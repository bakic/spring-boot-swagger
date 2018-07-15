package com.baki.springbootswagger.controller;


import com.baki.springbootswagger.dto.AccountDto;
import com.baki.springbootswagger.model.Account;
import com.baki.springbootswagger.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping(value = "/{id}")
    public AccountDto getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.fetchAccounts();
    }

    @PostMapping
    public Account createAccount(@RequestBody AccountDto account) {
        return accountService.createAccount(account);
    }
}
