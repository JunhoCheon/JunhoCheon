package com.mysite.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.test.entity.hr_mem_entity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface Hr_mem_Repository extends JpaRepository<hr_mem_entity, Integer>{
	
	Page<hr_mem_entity> findAll(Pageable pageable);
	
}
