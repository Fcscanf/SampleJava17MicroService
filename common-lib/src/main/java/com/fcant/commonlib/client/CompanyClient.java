package com.fcant.commonlib.client;

import com.fcant.commonlib.bean.Company;
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
@FeignClient(name = "${serviceName.company}", path = "/v1/company", url = "${endpoint.companyService}")
public interface CompanyClient {

    @GetMapping(path = "/{id}")
    ResponseEntity<Company> findById(@PathVariable("id") Long id);
}
