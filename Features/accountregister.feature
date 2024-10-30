Feature: Account Register
  
  @E2E
  Scenario: Verify Account Register Functionality
    Given User should be on Open Cart Demo Page
    When Click On My Account then Register
    Then Fill Up ALL Info & Logout