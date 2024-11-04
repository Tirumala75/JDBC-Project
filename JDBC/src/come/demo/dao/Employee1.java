package come.demo.dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

import come.demo.dto.Employee;

public class Employee1 {
	public void createEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
				Statement st=con.createStatement();
				st.execute("create table Employee(name varchar(12) not null,id int primary key,salary double,address varchar(20),gender char(7))");
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public int insert(Employee e) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setInt(2,e.getId());
			ps.setDouble(3,e.getSalary());
			ps.setString(4,e.getAddress());
			ps.setString(5,e.getGender());
			
			int res=ps.executeUpdate();
			con.close();
			return res;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
		
	}
	public int Update(Employee e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
				PreparedStatement ps=con.prepareStatement("update Employee set name=?,salary=?,address=? Where id=?");
				ps.setString(1,e.getName());
				ps.setDouble(2,e.getSalary());
				ps.setString(3,e.getAddress());
				ps.setInt(4,e.getId());
				int r=ps.executeUpdate();
				con.close();
				return r;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
		
	}
	public int delete(Employee e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
				PreparedStatement ps=con.prepareStatement("delete from Employee Where id=?");
				ps.setInt(1,e.getId());
				int r=ps.executeUpdate();
				con.close();
				return r;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
		
	}
	public Employee getById(int id){
		Employee e=new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
				PreparedStatement ps=con.prepareStatement("select * from Employee Where id=?");
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					e.setName(rs.getString("name"));
					e.setId(rs.getInt("id"));
					e.setSalary(rs.getDouble("Salary"));
					e.setAddress(rs.getString("address"));
					e.setGender(rs.getString("gender"));
				}
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return e;
		
	}
	public List<Employee> getByAll(){
		List<Employee> li=new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("select * from Employee");
				while(rs.next()){
					Employee e=new Employee();
					e.setName(rs.getString("name"));
					e.setId(rs.getInt("id"));
					e.setSalary(rs.getDouble("salary"));
					e.setAddress(rs.getString("address"));
					e.setGender(rs.getString("gender"));
					li.add(e);
					
				}
				con.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
		
	}
	private void While(boolean next) {
		// TODO Auto-generated method stub
		
	}
}
