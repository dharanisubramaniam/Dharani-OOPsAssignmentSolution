package com.greatlearning.main;

import com.greatlearning.assignment.AdminDepartment;
import com.greatlearning.assignment.HrDepartment;
import com.greatlearning.assignment.TechDepartment;

public class DriverClass {
	public static void main(String args[]) {
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayHoliday()+"\n");
		
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayHoliday()+"\n");
		
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayHoliday());
	}

}
