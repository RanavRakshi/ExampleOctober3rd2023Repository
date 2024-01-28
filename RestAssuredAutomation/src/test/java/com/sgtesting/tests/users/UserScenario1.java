package com.sgtesting.tests.users;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserScenario1 {
	
	@Test
	public void createUser()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users";
			RequestSpecification httpRequest=RestAssured.given();
			
			// create File Object
//			String path=System.getProperty("user.dir");    it provides the clarity that path is taken or not
//			System.out.println(path);
//			File jsonfile=new File(path+"/datafiles/createuser.json");
			File jsonfile=new File("./datafiles/createuser.json");
			
			// Header and Body Values
			httpRequest.header("content-type","application/json");
			httpRequest.body(jsonfile);
			
			// Execute Post method
			Response response=httpRequest.post();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void getUser()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/1";
			RequestSpecification httpRequest=RestAssured.given();
			
			// Header values
			httpRequest.header("content-type","application/json");
			
			// Execute Get method
			Response response=httpRequest.get();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void updateUserUsingPut()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/1";
			RequestSpecification httpRequest=RestAssured.given();
			
			// File Object
			File jsonfile=new File("./datafiles/updateuser.json");
			
			// Header values
			httpRequest.header("content-type","application/json");
			httpRequest.body(jsonfile);
			
			// Execute Put method
			Response response=httpRequest.put();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void updateUserUsingPatch()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/1";
			RequestSpecification httpRequest=RestAssured.given();
			// File Object
			File jsonfile=new File("./datafiles/updateuserpatch.json");
			
			// Header values
			httpRequest.header("content-type","application/json");
			httpRequest.body(jsonfile);
			
			// Execute Patch method
			Response response=httpRequest.patch();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void deleteUser()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/1";
			RequestSpecification httpRequest=RestAssured.given();
			
			// Header value
			httpRequest.header("content-type","application/json");
			
			// Execute Delete method
			Response response=httpRequest.delete();
			String content=response.asPrettyString();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
