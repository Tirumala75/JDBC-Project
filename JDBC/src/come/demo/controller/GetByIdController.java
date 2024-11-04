package come.demo.controller;

import come.demo.dto.Employee;
import come.demo.service.EmployeeService;

public class GetByIdController {
	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		Employee emp=es.getById(22);
		if(emp!=null) {
			System.out.println("Employee name is:"+emp.getName());
			System.out.println("Employee id is:"+emp.getId());
			System.out.println("Employee salary is:"+emp.getSalary());
			System.out.println("Employee address is:"+emp.getAddress());
			System.out.println("Employee gender is:"+emp.getGender());
			
			
		}
	}

}
