package com.JackeyZz.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.JackeyZz.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	public List<EmployeeVO> getAllEmployees(){
		List<EmployeeVO> employees=new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1=new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("JackeyZz");
		vo1.setLastName("JackeyZzhold");
		employees.add(vo1);
		
		EmployeeVO vo2=new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("JackeyZz22");
		vo2.setLastName("JackeyZzhold22");
		employees.add(vo2);
		
		return employees;
	}
}
