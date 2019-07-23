

Feature: TestMeApp
  

Scenario: login
    Given Launch Google Chrome and Load TestMeApp URL
    And Navigate to SignUp
    And  Enter the data in field  


      | UserName  | Password     | 
      | AlexUser  |     Alex@123 | 
    
     Then Click on login 
