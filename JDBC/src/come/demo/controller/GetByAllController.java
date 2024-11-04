package come.demo.controller;

import java.util.List;

import come.demo.dto.Employee;
import come.demo.service.EmployeeService;

public class GetByAllController {
	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		List<Employee> li=es.getByAllService();
		if(li!=null) {
			for(Employee e:li) {
				System.out.println("Employee name is: "+e.getName());
				System.out.println("Employee id is: "+e.getId());
				System.out.println("Employee salary is: "+e.getSalary());
				System.out.println("Employee address is: "+e.getAddress());
				System.out.println("Employee gender is: "+e.getGender());
				System.out.println(".............................................");
				
				
			}
		}
		
	}

}
