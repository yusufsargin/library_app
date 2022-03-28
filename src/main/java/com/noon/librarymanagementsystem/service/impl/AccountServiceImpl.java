package com.noon.librarymanagementsystem.service.impl;

import com.noon.librarymanagementsystem.entity.Account;
import com.noon.librarymanagementsystem.entity.Student;
import com.noon.librarymanagementsystem.repository.AccountRepository;
import com.noon.librarymanagementsystem.service.AccountService;

import java.util.List;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:54
 */
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
