package com.demo.security.controller;

import com.demo.security.model.Account;
import com.demo.security.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * Returns the account with the given id if the user is the owner of the account.
     * @param accountId the id of the account to retrieve
     * @param authentication the authentication object, used to get the current user's username
     * @return the account with the given id if the user is the owner of the account, otherwise
     *         a RuntimeException is thrown
     */
    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable Long accountId, Authentication authentication) {
        String username = authentication.getName();
        return accountRepository.findByIdAndUsername(accountId, username)
                .orElseThrow(() -> new RuntimeException("Account not found or not authorized"));
    }
}
