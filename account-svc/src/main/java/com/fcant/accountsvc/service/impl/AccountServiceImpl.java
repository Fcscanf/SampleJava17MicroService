package com.fcant.accountsvc.service.impl;

import com.fcant.commonlib.bean.Account;
import com.fcant.accountsvc.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * AccountServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:39 2021/10/11/0011
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public Account save(Account account) {
        return account;
    }

    @Override
    public Account findById(long id) {
        return Account.builder().id(1L).email("fcscanf@outlook.com").name("Fcant").build();
    }
}
