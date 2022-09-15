package com.fcant.accountsvc.controller;

import com.fcant.commonlib.bean.Account;
import com.fcant.accountsvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * AccountController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:43 2021/10/11/0011
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> saveAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accountService.findById(id));
    }
}
