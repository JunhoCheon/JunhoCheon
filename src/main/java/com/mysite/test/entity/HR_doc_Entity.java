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
public class HR_doc_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer docNum;
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private hr_mem_entity hrmemeentity;
	
	@Column(length = 5)
	private String name;
	
	@Column(length = 20)
	private String docType;
	
	@Column(length = 20)
	private String docUse;
	
	@Column(columnDefinition = "DATE")
	private Date docDate;
}
