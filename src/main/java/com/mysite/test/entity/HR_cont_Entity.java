package com.mysite.test.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HR_cont_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num;
	
	@Column(columnDefinition = "DATE")
	private Date contratDate;
	
	@Column(length = 20)
	private String contractName;
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private hr_mem_entity hrmementity;
	
	@Column
	private String name;
}
