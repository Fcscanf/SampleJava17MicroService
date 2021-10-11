package com.fcant.companysvc.repository;

import com.fcant.companysvc.bean.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:26 2021/10/11/0011
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
