package com.example.portfolio.security.service;

import com.example.portfolio.security.domain.AppUser;
import com.example.portfolio.security.domain.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser>getUsers();
}
