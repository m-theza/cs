
@tag
Feature: TestMeApp
  
Scenario: The one where the user moves to cart without adding any item in it
    Given Alex has registered in to TestMeApp
    When Alex search a particuolar product like headphone
    And try to proceed to payment without adding any item in the cart
    Then TestMeApp doesn't display the cart icon
    

