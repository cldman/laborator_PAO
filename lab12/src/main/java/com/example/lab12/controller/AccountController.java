package com.example.lab12.controller;

import com.example.lab12.model.Account;
import com.example.lab12.repository.AccountRepository;
import com.example.lab12.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService service;
    //GET for retrieval
    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return service.getAllAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return service.getAccountById(id);
    }

    @PutMapping("/accounts/{id}")
    public Account updateAccount(@RequestBody Account account, @PathVariable Long id) throws  Exception{
        return service.updateAccount(id, account);
    }

    @PostMapping("/accounts")
    public Account saveAccount(@RequestBody Account account) {
        return service.saveAccount(account);
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable Long id) {
        service.deleteById(id);
    }
}
