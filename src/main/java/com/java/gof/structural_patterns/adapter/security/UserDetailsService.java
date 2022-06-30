package com.java.gof.structural_patterns.adapter.security;

//target type
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
