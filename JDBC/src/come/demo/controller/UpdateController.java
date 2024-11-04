package come.demo.controller;

import come.demo.dto.Employee;
import come.demo.service.EmployeeService;

public class UpdateController {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("yamini");
		e.setSalary(50000);
		e.setAddress("hyderabad");
		e.setId(23);
		EmployeeService es=new EmployeeService();
		int res=es.UpdateService(e);
		if(res>=0) {
			System.out.println("updation is successfull...");
		}
		else {
			System.out.println("please update code...");
		}
		
	}

}
