Feature: Login with valid username and password 

Scenario: I am as a user I am able to login with valid username and password 

Given I am at login page in my page 
And I wrote username as "Muhammet" Password is like "asd123" 
When I am clicking login button  
Then I am in home page 


 