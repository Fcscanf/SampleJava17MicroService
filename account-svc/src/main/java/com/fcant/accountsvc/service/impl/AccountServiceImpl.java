package com.fcant.accountsvc.service.impl;

import com.fcant.accountsvc.service.AccountService;
import com.fcant.commonlib.bean.Account;
import com.fcant.commonlib.bean.Company;
import com.fcant.commonlib.client.CompanyClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    CompanyClient companyClient;

    @Override
    public Account save(Account account) {
        return account;
    }

    @Override
    public Account findById(long id) {
        ResponseEntity<Company> companyClientById = companyClient.findById(id);
        return Account.builder().id(1L).email("fcscanf@outlook.com").name("Fcant").company(companyClientById.getBody()).build();
    }
}
