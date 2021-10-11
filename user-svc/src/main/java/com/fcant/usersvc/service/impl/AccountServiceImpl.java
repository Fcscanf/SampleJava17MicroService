package com.fcant.usersvc.service.impl;

import com.fcant.usersvc.bean.Account;
import com.fcant.usersvc.repository.AccountRepository;
import com.fcant.usersvc.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * AccountServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:39 2021/10/11/0011
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account findById(long id) {
        final Optional<Account> accountById = accountRepository.findById(id);
        return accountById.orElse(null);
    }
}
