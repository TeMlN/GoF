package com.java.gof.structural_patterns.adapter.adapter;

import com.java.gof.structural_patterns.adapter.Account;
import com.java.gof.structural_patterns.adapter.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
