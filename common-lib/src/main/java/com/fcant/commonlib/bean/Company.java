package com.fcant.commonlib.bean;

import lombok.Builder;
import lombok.Data;

/**
 * Account
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:16 2021/10/11/0011
 */
@Data
@Builder
public class Company {
    private Long id;

    private String name;

}
