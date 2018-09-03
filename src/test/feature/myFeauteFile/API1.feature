Feature: using valid departmant ID i can get a valid data
@API
Scenario: using valid department ID 

Given I create map and store data in the map 
And I create response class and get my data from API server 
And I check status code as "200"
When I deserialize code from JSON to java 
Then I check my expected data and actual data should be same

 

