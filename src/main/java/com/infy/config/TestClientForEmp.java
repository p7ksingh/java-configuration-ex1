package com.infy.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClientForEmp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
        Emp e = context.getBean("emp", Emp.class);
          System.out.println(" Emp Name: " + e.empName+"\n Emp Id"+e.empId+"\n Emp Company: " + e.empCompany);    
    }
}
