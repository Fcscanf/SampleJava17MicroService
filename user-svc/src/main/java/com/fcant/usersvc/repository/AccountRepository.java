package com.fcant.usersvc.repository;

import com.fcant.commonlib.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AccountRepository
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:27 2021/10/11/0011
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}
