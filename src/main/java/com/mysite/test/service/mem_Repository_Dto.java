package com.mysite.test.service;

import java.time.LocalDate;

import com.mysite.test.entity.HR_dept_Entity;
import com.mysite.test.entity.hr_mem_entity;

import lombok.Getter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Getter
public class mem_Repository_Dto {
	private Integer employeeId;
	private String name;
	private HR_dept_Entity deptName;
	private String position;
	private String email;
	private LocalDate startDate;
	private Integer bankNum;
	private Integer regularPay;
	
	public mem_Repository_Dto(hr_mem_entity entity) {
		this.employeeId = entity.getEmployeeId();
		this.bankNum = entity.getBankNum();
		this.deptName =entity.getHRdeptEntity();
		this.email = entity.getEmail();
		this.name = entity.getName();
		this.position = entity.getPosition();
		this.regularPay = entity.getRegularPay();
		this.startDate = entity.getStartDate();
	}
}
