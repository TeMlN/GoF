package com.java.gof.structural_patterns.adapter.adapter;

import com.java.gof.structural_patterns.adapter.Account;
import com.java.gof.structural_patterns.adapter.AccountService;
import com.java.gof.structural_patterns.adapter.security.UserDetails;
import com.java.gof.structural_patterns.adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
