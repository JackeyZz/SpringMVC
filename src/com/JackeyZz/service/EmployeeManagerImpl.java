package com.JackeyZz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JackeyZz.dao.EmployeeDAO;
import com.JackeyZz.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager{

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees(){
		return dao.getAllEmployees();
	}
}
