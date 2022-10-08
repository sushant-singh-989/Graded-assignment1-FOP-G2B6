package com.gl.FOP.main;

import com.gl.FOP.SuperDepartment.*;
import com.gl.FOP.AdminDepartment.*;
import com.gl.FOP.HrDepartment.*;
import com.gl.FOP.TechDepartment.*;

public class MainDriver {
	
	public static void main(String[] args) {
		
		SuperDepartment sd = new SuperDepartment();
		AdminDepartment ad = new AdminDepartment();
		HRDepartment hr = new HRDepartment();
		TechDepartment td = new TechDepartment();
		
		System.out.println("Welcome to Admin Department\n"
		+ad.getTodaysWork()+"\n"+ad.getWorkDeadline()+"\n"
		+sd.isTodayAHoliday()+"\n ");
		
		System.out.println("Welcome to HR Department\n"
		+hr.doActivity()+"\n"+hr.getTodaysWork()+"\n"+hr.getWorkDeadline()+"\n"
		+sd.isTodayAHoliday()+"\n ");
		
		System.out.println("Welcome to Tech Department\n"
		+td.getTodaysWork()+"\n"+td.getWorkDeadline()+"\n"+td.getTechStackInformation()
		+"\n"+sd.isTodayAHoliday());
		
		
	
				
	}

}
