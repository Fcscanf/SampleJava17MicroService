package com.fcant.companysvc.service.impl;

import com.fcant.commonlib.bean.Company;
import com.fcant.commonlib.monitor.CountTime;
import com.fcant.companysvc.service.CompanyService;
import org.springframework.stereotype.Service;

/**
 * CompanyServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:50 2021/10/11/0011
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    @CountTime(name = "", tag = "")
    public Company save(Company company) {
        return company;
    }

    @Override
    public Company findById(long id) {
        return Company.builder().id(1L).name("Test").build();
    }
}
