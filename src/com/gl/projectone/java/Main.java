package com.gl.projectone.java;

public class Main
{
	 public static void main(String[]args)
	    {
	        AdminDepartment admin = new AdminDepartment();
	        System.out.println(admin.getTodaysWork());
	        System.out.println(admin.getWorkDeadline());
	        System.out.println(admin.isTodayHoliday());
	        
	        HrDepartment hr = new HrDepartment();
	        System.out.println(hr.doActivity());
	        System.out.println(hr.getTodaysWork());
	        System.out.println(hr.getWorkDeadline());
	        System.out.println(hr.isTodayHoliday());
	        
	        TechDepartment tech = new TechDepartment();
	        System.out.println(tech.getTodaysWork());
	        System.out.println(tech.getWorkDeadline());
	        System.out.println(tech.getTechStackInformation());
	        System.out.println(tech.isTodayHoliday());
	    }
}
