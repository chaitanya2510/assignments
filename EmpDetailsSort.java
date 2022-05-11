package com.employeelist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class Employeedetailssort {

	public static void main(String[] args) {
ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee (777,"Chaitanya",50000.0));
		emp.add(new Employee(333,"Nayan",30000.0));
		emp.add(new Employee(444,"Kirti",40000.0));
		emp.add(new Employee(666,"Sam",33000.0));
		emp.add(new Employee(500,"John",1000.0));
		emp.add(new Employee(400,"Vishal",3000.0));
		emp.add(new Employee(255,"Vaibhav",9000.0));
    emp.add(new Employee(345,"",6000.0));
    emp.add(new Employee(540,"Venky",5000.0));
    emp.add(new Employee(150,"Rahul",4000.0));
		
		
		Iterator<Employee> it = emp.iterator(); 
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
		  
		  System.out.println("------");
		  
		  it = emp.iterator();  
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
      
	}
	
