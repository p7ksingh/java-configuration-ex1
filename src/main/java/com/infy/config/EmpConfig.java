package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
    @Bean
    public Emp emp() {
        Emp e = new Emp();
        e.setEmpId(111);
        e.setEmpName("Pankaj");
        e.setEmpCompany("Infosys");
        return e;
    }
}
