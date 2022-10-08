package com.gl.FOP.HrDepartment;

import com.gl.FOP.SuperDepartment.*;

public class HRDepartment extends SuperDepartment {
	
    public String departmentName() {
		
		return "Hr Department";
	}
	public String getTodaysWork() {
		
		return "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	public String doActivity() {
		
		return "Team lunch";
	}


}
