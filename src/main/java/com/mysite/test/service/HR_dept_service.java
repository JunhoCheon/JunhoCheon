package com.mysite.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.test.entity.HR_dept_Entity;
import com.mysite.test.repository.HR_dept_Repository;

@Service
public class HR_dept_service {
	
	private final HR_dept_Repository hR_dept_Repository;

	@Autowired
	public HR_dept_service(HR_dept_Repository hR_dept_Repository) {
	    this.hR_dept_Repository = hR_dept_Repository;
	}

	public void initializeDepartments() {
	    HR_dept_Entity hrDept1 = new HR_dept_Entity();
	    hrDept1.setDeptName("인사팀");
	    hrDept1.setDeptCode(1);
	    hR_dept_Repository.save(hrDept1);

	    HR_dept_Entity hrDept2 = new HR_dept_Entity();
	    hrDept2.setDeptName("구매팀");
	    hrDept2.setDeptCode(2);
	    hR_dept_Repository.save(hrDept2);
	    
	    HR_dept_Entity hrDept3 = new HR_dept_Entity();
	    hrDept3.setDeptName("영업팀");
	    hrDept3.setDeptCode(3);
	    hR_dept_Repository.save(hrDept3);

	    HR_dept_Entity hrDept4 = new HR_dept_Entity();
	    hrDept4.setDeptName("생산팀");
	    hrDept4.setDeptCode(4);
	    hR_dept_Repository.save(hrDept4);

	    HR_dept_Entity hrDept5 = new HR_dept_Entity();
	    hrDept5.setDeptName("회계팀");
	    hrDept5.setDeptCode(5);
	    hR_dept_Repository.save(hrDept5);
	}
}
