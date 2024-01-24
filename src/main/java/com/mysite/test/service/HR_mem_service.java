package com.mysite.test.service;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mysite.test.entity.HR_dept_Entity;
import com.mysite.test.entity.hr_mem_entity;
import com.mysite.test.repository.Hr_mem_Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class HR_mem_service {
	@Autowired
	private Hr_mem_Repository memRepository;

	public Page<hr_mem_entity> getList(int page){
		Pageable pageable = PageRequest.of(page, 10);
		return this.memRepository.findAll(pageable);
	}

		
	
	
	public void hr_mem_create(String name, LocalDate startdate, HR_dept_Entity deptname, String position, String email,
			Integer banknum, Integer regualpay, Integer employeeId) {
		hr_mem_entity memen = new hr_mem_entity();


		memen.setEmployeeId(employeeId);
		memen.setName(name);
		memen.setHRdeptEntity(deptname);
		memen.setPosition(position);
		memen.setStartDate(startdate);
		memen.setEmail(email);
		memen.setBankNum(banknum);
		memen.setRegularPay(regualpay);

		memRepository.save(memen);

	}

}
