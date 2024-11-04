package come.demo.service;

import java.util.List;

import come.demo.dao.Employee1;

import come.demo.dto.Employee;

public class EmployeeService {
	Employee1 ed=new Employee1();
	public void create() {
		ed.createEmployee();
	}
	public int insertService(Employee e) {
		return ed.insert(e);
		}
	public int UpdateService(Employee e) {
		return ed.Update(e);
		
	}
	public int DeleteService(Employee e) {
		return ed.delete(e);
	}
	public Employee getById(int id) {
		return ed.getById(id);
		
	}
	public List<Employee> getByAllService(){
		return ed.getByAll();
		
	}


}
