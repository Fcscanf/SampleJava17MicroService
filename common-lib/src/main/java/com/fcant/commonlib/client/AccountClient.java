package com.fcant.commonlib.client;

import com.fcant.commonlib.bean.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * AccountClient
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 15:59 2022/9/15/0015
 */
@FeignClient(name = "${serviceName.account}", path = "/v1/account", url = "${endpoint.accountService}")
public interface AccountClient {

    @GetMapping(path = "/{id}")
    ResponseEntity<Account> findById(@PathVariable("id") Long id);
}
