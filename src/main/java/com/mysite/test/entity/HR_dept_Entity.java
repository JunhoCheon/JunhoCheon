package com.mysite.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HR_dept_Entity {
	
@Id
private String deptName;

@Column(length = 2)
private Integer deptCode;

}
