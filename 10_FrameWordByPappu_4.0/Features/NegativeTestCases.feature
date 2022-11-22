Feature: Testing  Functionality to the Application
  
 Scenario Outline: This Scenario tests all the invalid username and password.
    
    Given User Open The Browser
    When User Navigate to the "https://www.saucedemo.com/" WebApplication
    And User put invalid Username "<UserName>" 
    And User put  invalid Password  "<Password>"
    And User Click on Login button
    Then User Should see Username and password do not match any user in this service message
    
    Examples: 
      | UserName  			 				| Password | 
      | standard_user1	   			| secret_saece | 
      | standard_user2	   			| secret_saece1| 
		  | standard_user1	  			| secret_siuce1 |
		  | standard_user	   				| secret_saece | 
		  | standard_user5	   			| secret_spoce |