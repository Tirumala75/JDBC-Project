package come.demo.controller;

import come.demo.dto.Employee;
import come.demo.service.EmployeeService;

public class InsertController {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("prasanna");
		e.setId(27);
		e.setAddress("hyderabad");
		e.setGender("female");
		e.setSalary(80000.0);
		EmployeeService es=new EmployeeService();
		int res=es.insertService(e);
		if(res>0) {
			System.out.println("insertion is successfull...");
		}
		else {
			System.out.println("please check code..");
		}
		
	
	}

}
