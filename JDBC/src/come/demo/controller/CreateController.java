package come.demo.controller;

import come.demo.service.EmployeeService;

public class CreateController {
	public static void main(String[]args) {
		EmployeeService es=new EmployeeService();
		es.create();
		System.out.println("table is created successfully...");
	}

}
