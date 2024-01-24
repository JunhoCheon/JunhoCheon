package com.mysite.test.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class HR_work_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num;
	
	@Column(columnDefinition = "DATE")
	private String workDate;
	
	@ManyToOne
	@JoinColumn(name = "employeeid")
	private hr_mem_entity hrmementity;
	
	@Column(length = 5)
	private String name;
	
	@Column(columnDefinition = "TIME")
	private Time startTime;
	
	@Column(columnDefinition = "TIME")
	private Time endTime;
	
	@Column(length =2)
	private Integer workHour;
	
	@Column(length =2)
	private Integer overTimeHour;
	
	@Column
	private String overTimeType;
	
	@Column(length = 20)
	private Integer overTimePay;
	
	@Column(length = 20)
	private String attenDance;
}
