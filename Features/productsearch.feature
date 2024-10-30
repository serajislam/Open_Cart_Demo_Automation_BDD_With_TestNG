Feature: Product Search
  
  @Smoke
  Scenario Outline: Verify Product Search Functionality
    Given User should be on Open Cart Demo Page
    When Enter "<productName>"
    Then Click On Search

    Examples: 
    |productName|
    |Mac (2)|
    |HTC Touch HD|
    |iPod Classic|
   
    