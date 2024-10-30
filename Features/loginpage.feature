Feature: Login
  
  @Smoke
  Scenario Outline: Verify Login Functionality
    Given User should be on Open Cart Demo Page
    When Click On My Account then Login
    Then Enter "<userName>" & "<password>"
    Then Click On Login Button
    Then Click On Log Out

    Examples: 
    |userName|                   |password|
    |demo_cart_04@getnada.com| |Test@123|
    