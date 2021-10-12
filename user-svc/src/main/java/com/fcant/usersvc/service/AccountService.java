package com.fcant.usersvc.service;

import com.fcant.commonlib.bean.Account;

/**
 * AccountService
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:39 2021/10/11/0011
 */
public interface AccountService {
    public Account save(Account account);

    public Account findById(long id);
}
