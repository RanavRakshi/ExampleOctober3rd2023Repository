package com.sgtesting.tests.assignments;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgtesting.tests.pojo.Users;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssignmentQ1 {
	
	// 1. createuser-›displayUser-›deleteUser

	public static String user_id=null; 
	@Test(priority = 1)
	public void createUser()
	{
		try {
			System.out.println("create user scenario using POST http Method");
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users";
			RequestSpecification httpRequest=RestAssured.given();

			// create Pojo class object
			Users userObject=new Users("Rajarajeshwari nagar", 
					"demouser@gmail.com", 
					"Demo", 
					"User", 
					"9987654321", 
					"Karnataka", 
					"Leader", 
					560098);

			ObjectMapper mapper=new ObjectMapper();
			String jsonUsers=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userObject);
			System.out.println(userObject);

			// create header and Body values
			httpRequest.header("content-type","application/json");
			httpRequest.body(jsonUsers);

			// Execute Post Method
			Response response=httpRequest.post();
			String content=response.asPrettyString();
			System.out.println(content);

			// to get the user_id
			JsonPath jPath=response.jsonPath();
			user_id=jPath.getString("id");
			System.out.println("User_id from Response: "+user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void displayUser()
	{
		try {
			System.out.println("Get User scenarion using Get Method");
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
			RequestSpecification httpRequest=RestAssured.given();

			// create header values
			httpRequest.header("content-type","application/json");

			// Execute Get Method
			Response response=httpRequest.get();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void deleteUser() 
	{
		try {
			System.out.println("Delete User using Delete Method");
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
			RequestSpecification httpRequest=RestAssured.given();

			// create header values
			httpRequest.header("content-type","application/json");

			// Execute Delete Method
			Response response=httpRequest.delete();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
