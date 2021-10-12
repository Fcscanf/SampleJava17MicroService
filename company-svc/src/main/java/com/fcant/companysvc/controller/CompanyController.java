package com.fcant.companysvc.controller;

import com.fcant.commonlib.bean.Company;
import com.fcant.companysvc.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * CompanyController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:53 2021/10/11/0011
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> saveAccount(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.save(company));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(companyService.findById(id));
    }
}
