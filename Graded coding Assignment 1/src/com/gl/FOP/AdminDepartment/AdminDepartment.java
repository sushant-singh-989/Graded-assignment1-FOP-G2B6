package com.gl.FOP.AdminDepartment;

import com.gl.FOP.SuperDepartment.*;

public class AdminDepartment extends SuperDepartment {
	
    public String departmentName() {
		
		return "Admin department";
	}
	public String getTodaysWork() {
		
		return "Complete Your Documents Submission";
	}
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}

}
