package com.fcant.accountsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.fcant.commonlib.client"})
public class AccountSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountSvcApplication.class, args);
    }

}
