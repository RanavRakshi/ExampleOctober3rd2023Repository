package com.sgtesting.tests.api.stepdefinitions;

import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgtesting.tests.api.pojo.Customers;
import com.sgtesting.tests.api.pojo.Projects;
import com.sgtesting.tests.api.pojo.Users;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions {
	public static RequestSpecification httpRequest=null;
	public static Users userobj=null;
	public static Customers customerObject=null;
	public static Projects projectObject=null;
	public static String userjsonobject=null;
	public static String customerjsonobject=null;
	public static String projectjsonobject=null;
	public static Response response=null;
	public static String user_id=null;
	public static String customer_id=null;
	public static String project_id=null;
	/**
	 * Step Name : I specify the post restful api endpoint url
	 */
	@Given("^I specify the post restful api endpoint url$")
	public void I_specify_the_post_restful_api_endpoint_url()
	{
		try
		{
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users";
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I access given method to get RequestSpecification object
	 */
	@And("^I access given method to get RequestSpecification object$")
	public void I_access_given_method_to_get_RequestSpecification_object()
	{
		try
		{
			httpRequest=RestAssured.given();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name:I create user object using user pojo class
	 */
	@And("^I create user object using user pojo class$")
	public void I_create_user_object_using_user_pojo_class()
	{
		try
		{
			userobj=new Users();
			userobj.setAddress("12th Main,7th Cross Vijayanagar");
			userobj.setEmailId("vinu@gmail.com");
			userobj.setFirstName("vinith");
			userobj.setLastName("B");
			userobj.setPhoneNumber("9010203040");
			userobj.setStateName("Karnataka");
			userobj.setUserRole("QA Engineer");
			userobj.setZipcode(560098);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I convert user object into user json object
	 */
	@And("^I convert user object into user json object$")
	public void I_convert_user_object_into_user_json_object()
	{
		try
		{
			ObjectMapper mapper=new ObjectMapper();
			userjsonobject=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userobj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I provide header and body contents
	 */
	@And("^I provide header and body contents$")
	public void I_provide_header_and_body_contents()
	{
		try
		{
			httpRequest.header("Content-Type", "application/json");
			httpRequest.body(userjsonobject);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I access post http method to send request to server
	 */
	@When("^I access post http method to send request to server$")
	public void I_access_post_http_method_to_send_request_to_server()
	{
		try
		{
			response=httpRequest.post();
			JsonPath jpath=response.jsonPath();
			user_id=jpath.getString("id");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I get status code as 201
	 */
	@Then("^I get status code as 201$")
	public void I_get_status_code_as_201()
	{
		try
		{
			int statuscode=response.getStatusCode();
			Assert.assertEquals(201, statuscode);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I specify the get restful api endpoint url
	 */
	@Given("^I specify the get restful api endpoint url$")
	public void I_specify_the_get_restful_api_endpoint_url()
	{
		try
		{
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I access get http method to retrive resource from server
	 */
	@When("^I access get http method to retrive resource from server$")
	public void I_access_get_http_method_to_retrive_resource_from_server()
	{
		try
		{
			response=httpRequest.get();
			String content=response.asPrettyString();
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I validate content in response object
	 */
	@Then("^I validate content in response object$")
	public void I_validate_content_in_response_object()
	{
		try
		{
			JsonPath jpath=response.jsonPath();
			String address=jpath.getString("address");
			Assert.assertEquals("12th Main,7th Cross Vijayanagar", address);

			String emailid=jpath.getString("emailId");
			Assert.assertEquals("vinu@gmail.com", emailid);

			String userrole=jpath.getString("userRole");
			Assert.assertEquals("QA Engineer", userrole);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I get status code as 200
	 */
	@And("^I get status code as 200$")
	public void I_get_status_code_as_200()
	{
		try
		{
			int statuscode=response.getStatusCode();
			Assert.assertEquals(200, statuscode);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I specify the delete restful api endpoint url
	 */
	@Given("^I specify the delete restful api endpoint url$")
	public void I_specify_the_delete_restful_api_endpoint_url()
	{
		try
		{
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I access delete http method to delete resource from server
	 */
	@When("^I access delete http method to delete resource from server$")
	public void I_access_delete_http_method_to_delete_resource_from_server()
	{
		try
		{
			response=httpRequest.delete();
			String content=response.asString();
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Step Name: I specify the customers post restful api endpoint URL
	 */
	@When("^I specify the customers post restful api endpoint URL$")
	public void I_specify_the_customers_post_restful_api_endpoint_URL()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/customers";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I create customer object using pojo class
	 */
	@And("^I create customer object using pojo class$")
	public void I_create_customer_object_using_pojo_class()
	{
		try {
			customerObject=new Customers("VijayNagar",
					"HP", 
					"hpworldindia@gmail.com", 
					"Bangalore", 
					"9987654321");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I convert customer object into customer json object
	 */
	@And("^I convert customer object into customer json object$")
	public void I_convert_customer_object_into_customer_json_object()
	{
		try {
			ObjectMapper mapper=new ObjectMapper();
		    customerjsonobject=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customerObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I provide customer header and body contents
	 */
	@And("^I provide customer header and body contents$")
	public void I_provide_customer_header_and_body_contents()
	{
		try
		{
			httpRequest.header("Content-Type", "application/json");
			httpRequest.body(customerjsonobject);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I access customer post http method to send request to server
	 */
	@When("^I access customer post http method to send request to server$")
	public void I_access_customer_post_http_method_to_send_request_to_server()
	{
		try
		{
			response=httpRequest.post();
			JsonPath jpath=response.jsonPath();
			customer_id=jpath.getString("id");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	/**
	 * Step Name: I specify the get restful api endpoint URL
	 */
	@Given("^I specify the get restful api endpoint URL$")
	public void I_specify_the_get_restful_api_endpoint_URL()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/customers/"+customer_id;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I validate customer content in Response object
	 */
	@Then("^I validate customer content in Response object$")
	public void I_validate_customer_content_in_Response_object()
	{
		try {
			JsonPath jpath=response.jsonPath();
			String address=jpath.getString("address");
			Assert.assertEquals("VijayNagar", address);
			
			String customerName=jpath.getString("customerName");
			Assert.assertEquals("HP", customerName);
			
			String emailId=jpath.getString("emailId");
			Assert.assertEquals("hpworldindia@gmail.com", emailId);
			
			String location=jpath.getString("location");
			Assert.assertEquals("Bangalore", location);
			
			String phoneNumber=jpath.getString("phoneNumber");
			Assert.assertEquals("9987654321", phoneNumber);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I specify the delete restful api endpoint URL
	 */
	@Given("^I specify the delete restful api endpoint URL$")
	public void I_specify_the_delete_restful_api_endpoint_URL()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/customers/"+customer_id;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I specify the project post restful api endpoint URL
	 */
	@Given("^I specify the project post restful api endpoint URL$")
	public void I_specify_the_project_post_restful_api_endpoint_URL()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/projects";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I create project object using project pojo class
	 */
	@And("^I create project object using project pojo class$")
	public void I_create_project_object_using_project_pojo_class()
	{
		try {
			projectObject=new Projects("Provides Quality Laptops",
					Integer.valueOf(customer_id), 
					"Software", 
					"Voyager");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I convert project object into project json object
	 */
	@And("^I convert project object into project json object$")
	public void I_convert_project_object_into_project_json_object()
	{
		try {
			ObjectMapper mapper=new ObjectMapper();
			projectjsonobject=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(projectObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I provide project header and body contents
	 */
	@And("^I provide project header and body contents$")
	public void I_provide_project_header_and_body_contents()
	{
		try {
			httpRequest.header("content-type","application/json");
			httpRequest.body(projectjsonobject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I access project post http method to send Request to server
	 */
	@When("^I access project post http method to send Request to server$")
	public void I_access_project_post_http_method_to_send_Request_to_server()
	{
		try {
			response=httpRequest.post();
			JsonPath jPath=response.jsonPath();
			project_id=jPath.getString("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I specify the project get restful api endpoint URL
	 */
	@Given("^I specify the project get restful api endpoint URL$")
	public void I_specify_the_project_get_restful_api_endpoint_URL()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/projects/"+project_id;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I validate project content in Response object
	 */
	@Then("^I validate project content in Response object$")
	public void I_validate_project_content_in_Response_object()
	{
		try {
			JsonPath jpath=response.jsonPath();
			String description=jpath.getString("description");
			Assert.assertEquals("Provides Quality Laptops", description);
			
			String projectCustomerId=jpath.getString("projectCustomerId");
			Assert.assertEquals(Integer.valueOf(customer_id), projectCustomerId);
			
			String projectDomain=jpath.getString("projectDomain");
			Assert.assertEquals("Software", projectDomain);
			
			String projectName=jpath.getString("projectName");
			Assert.assertEquals("Voyager", projectName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Step Name: I specify the project delete restful api endpoint URL
	 */
	@Given("^I specify the project delete restful api endpoint URL$")
	public void I_specify_the_project_delete_restful_api_endpoint_URL()
	{
		try {
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/projects/"+project_id;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Given("^I connect to the Mysql Database$")
	public void I_connect_to_the_Mysql_Database()
	{
		System.out.println("I connect to the Mysql Database!!!!!1");
	}

	@And("^I execute config database scripts$")
	public void I_execute_config_database_scripts()
	{
		System.out.println("I execute config database scripts!!!!!1");
	}
}
