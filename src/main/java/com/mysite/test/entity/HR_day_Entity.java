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
public class HR_day_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num;

	@Column(columnDefinition = "DATE")
	private Date dayWorkDate;
	
	@ManyToOne
	@JoinColumn(name = "deptName")
	private HR_dept_Entity hRdeptEntity;
	
	@Column(length = 5)
	private String dayWorkName;
	
	@Column(length = 2)
	private Integer dayWorkHour;
	
	@Column(length = 20)
	private Integer dayWorkPay;
}
