package com.fcant.companysvc.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * Account
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 23:16 2021/10/11/0011
 */
@Entity
@Data
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
