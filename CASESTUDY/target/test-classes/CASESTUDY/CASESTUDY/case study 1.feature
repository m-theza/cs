  
Feature: TestMeApp
 
  Scenario: Register TestMeApp
    Given Launch Google Chrome and Load TestMeApp URL 
    And Navigate to SignUp
    And Enter the data in field   
    
      | UserName   | FirstName   | LastName      | Password | ConfrimPassword | Gender | E-mail                        |MobileNumber | DOB      |Address |SecurityQuestion         |Answer  |
      | Darshan97  | subadarshan | A             | 123456   | 123456           |  Male  | darshanalagarnathan@gmail.com | 7708943744   |10/11/1997|Chennai | What is your Birth palce ?|Madurai |
     
Then Click on Register Button