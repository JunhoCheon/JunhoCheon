package com.mysite.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final HR_dept_service dataInitializationService;

    @Autowired
    public DataInitializer(HR_dept_service dataInitializationService) {
        this.dataInitializationService = dataInitializationService;
    }

    @Override
    public void run(String... args) {
        // 부서 데이터 초기화
        dataInitializationService.initializeDepartments();
    }
}

