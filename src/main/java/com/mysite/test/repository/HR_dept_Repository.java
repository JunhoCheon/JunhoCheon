package com.mysite.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysite.test.entity.HR_dept_Entity;

import lombok.Getter;
import lombok.Setter;

@Repository
public interface HR_dept_Repository extends JpaRepository<HR_dept_Entity, String> {
    String getValueByDeptName(String deptName);
    List<Long> getDeptEntityIdByDeptName(String deptName);

}
