# Feature Name:
# User Story Name:
# User Story Number:
# Author:
# Description:
@Execute
Feature: Verify the create customer restful api endpoint New

Scenario: Create customer using restful api post endpoint
Given I specify the customers post restful api endpoint URL
And I access given method to get RequestSpecification object
And I create customer object using pojo class
And I convert customer object into customer json object
And I provide customer header and body contents 
When I access customer post http method to send request to server
Then I get status code as 201

Scenario: Display newly created customers
Given I specify the get restful api endpoint URL
And I access given method to get RequestSpecification object
When I access get http method to retrive resource from server 
Then I validate customer content in Response object
And I get status code as 200






