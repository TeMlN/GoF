package com.java.gof.structural_patterns.adapter;

import com.java.gof.structural_patterns.adapter.adapter.AccountUserDetailsService;
import com.java.gof.structural_patterns.adapter.security.LoginHandler;
import com.java.gof.structural_patterns.adapter.security.UserDetailsService;

public class Client {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("taemin", "taemin");
        System.out.println(login);
    }
}
