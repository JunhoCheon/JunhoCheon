package com.mysite.test.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class hr_mem_entity {
	

	@Id
	private Integer employeeId;
	
	@Column(length = 20)
	private String name;
	
	@Column(columnDefinition = "DATE")
	private LocalDate startDate;
	
	@ManyToOne
	@JoinColumn(name = "deptName")
	private HR_dept_Entity hRdeptEntity;
	
	@Column(length = 5)
	private String position;
	
	@Column(length = 20)
	private String email;
	
	@Column(length = 20)
	private Integer bankNum;
	
	@Column(length = 20)
	private Integer regularPay;

	
	}

