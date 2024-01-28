package com.sgtesting.tests.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeJSON {

	public static void main(String[] args) {
		employeeJSONObject();
		System.out.println("********************");
		System.out.println();
		employeeJSONArrayObject();
		System.out.println("********************");
		System.out.println();
		employeeJSONObject2();
	}
	
	private static void employeeJSONObject()
	{
		try {
			Employee object=new Employee(101,"Ranav","CEO",12000.50);
			
			ObjectMapper mapper=new ObjectMapper();
			String jsonEmployee=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(jsonEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void employeeJSONArrayObject()
	{
		try {
			Employee object[]= {
					new Employee(102,"Rakshith","Manager",10000.50),
					new Employee(103,"Ranjith","Dev",8000.50),
					new Employee(104,"Ruchi","Lead",9000.50)
			};
			
			ObjectMapper mapper=new ObjectMapper();
			String jsonEmployee=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(jsonEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void employeeJSONObject2()
	{
		try {
			Employee object=new Employee();
			object.setEmpID(105);
			object.setEmpName("Manju");
			object.setJobName("Architech");
			object.setSalary(11000.23);
			
			ObjectMapper mapper=new ObjectMapper();
			String jsonEmployee=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(jsonEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
