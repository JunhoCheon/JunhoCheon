package com.mysite.test.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.test.entity.HR_dept_Entity;
import com.mysite.test.entity.hr_mem_entity;
import com.mysite.test.repository.HR_dept_Repository;
import com.mysite.test.service.HR_mem_service;

import lombok.RequiredArgsConstructor;



@RequestMapping("/mem")
@RequiredArgsConstructor
@Controller
public class HR_mem_controller {
	@Autowired
	  private final HR_mem_service mem_service;
	  private final HR_dept_Repository hrdpr;
	  
	  
	    
	 
	@GetMapping("/memlist")
	public String list(Model model, @RequestParam(value="page", defaultValue="0") int page) {
		Page<hr_mem_entity> paging = this.mem_service.getList(page);
        model.addAttribute("paging", paging);
	    return "mem_list";
	}
	
	@GetMapping("/memcreate")
	public String hr_mem_create(){
		return "mem_create";
	}
	
	@PostMapping("/memcreate")
	public String hr_mem_create(
			 @RequestParam(value="name") String name
	        ,@RequestParam(value="email") String email
	        ,@RequestParam(value="deptname") HR_dept_Entity deptname
	        ,@RequestParam(value="position") String position
	        ,@RequestParam(value="startdate") LocalDate startdate
	        ,@RequestParam(value="banknum") Integer banknum
	        ,@RequestParam(value="regualpay") Integer regualpay
	        ,@RequestParam(value="employeeId") Integer employeeId){
	    
	    mem_service.hr_mem_create(name, startdate, deptname, position, email, banknum, regualpay, employeeId);
	    return "redirect:/mem/memlist";
	}
}

