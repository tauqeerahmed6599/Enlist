package com.project.enlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/JobInputScreen")
	public String inputJobDetails()
	{
		return "JobInputScreen";
	}
	
	@RequestMapping("/ClientScreen")
	   public String displayClient()
	   {
		   return "ClientScreen";
	  }
	
	@RequestMapping("/EmployeeScreen")
	public String displayEmployee()
	{
		return "EmployeeScreen";
	}
	
	@RequestMapping("/RoleScreen")
	public String displayRole()
	{
		return "RoleScreen";
	}
}
