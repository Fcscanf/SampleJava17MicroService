package com.fcant.companysvc.service.impl;

import com.fcant.commonlib.monitor.CountTime;
import com.fcant.commonlib.bean.Company;
import com.fcant.companysvc.repository.CompanyRepository;
import com.fcant.companysvc.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * CompanyServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:50 2021/10/11/0011
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    @CountTime(name = "", tag = "")
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company findById(long id) {
        final Optional<Company> company = companyRepository.findById(id);
        return company.orElse(null);
    }
}
