package com.fcant.companysvc.service;

import com.fcant.companysvc.bean.Company;

/**
 * CompanyService
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:50 2021/10/11/0011
 */
public interface CompanyService {
    Company save(Company company);

    Company findById(long id);
}
