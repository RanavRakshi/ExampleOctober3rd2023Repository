# Feature Name:
# User Story Name:
# User Story Number:
# Author:
# Description:
@Execute
Feature: Verify the create user restful api endpoint New

Scenario: Create Project by using restful api post endpoint
Given I specify the project post restful api endpoint URL
And I access given method to get RequestSpecification object
And I create project object using project pojo class
And I convert project object into project json object
And I provide project header and body contents
When I access project post http method to send Request to server
Then I get status code as 201

Scenario: Display newly created project
Given I specify the project get restful api endpoint URL
And I access given method to get RequestSpecification object
When I access get http method to retrive resource from server 
Then I validate project content in Response object
And I get status code as 200

Scenario: Delete newly created project
Given I specify the project delete restful api endpoint URL
And I access given method to get RequestSpecification object
When I access delete http method to delete resource from server
And I get status code as 200 

Scenario: Delete newly created customers
Given I specify the delete restful api endpoint URL
And I access given method to get RequestSpecification object
When I access delete http method to delete resource from server
Then I get status code as 200
