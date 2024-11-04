package come.demo.controller;

import come.demo.dto.Employee;
import come.demo.service.EmployeeService;

public class DeleteController {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(27);
		EmployeeService es=new EmployeeService();
		int i=es.DeleteService(e);
		if(i>0) {
			System.out.println("delation is successfull....");
		}else {
			System.out.println("please check code....");
		}
		
	}

}
