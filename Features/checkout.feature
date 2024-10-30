Feature: Check Out
  

  Scenario Outline: Verify Check Out Functionality
    Given User should be on Open Cart Demo Page
    When Click On My Account then Login
    Then Enter "<userName>" & "<password>" Credentials & Click on Login
    Then Search By Product Name "<productName>"
    Then Click On Search
    Then Click On Busket Icon To Add Cart
    Then Click On Add To Cart Btn
    Then Click On Checkout Btn
    Then Fill Up Shipping Address & Click On Continue
    Then Fill Up Shipping Method & Click On Confirm Order
    Then Click On Continue
    And Click On Log Out
    
    Examples: 
    |userName|                 |password|   |productName|
    |demo_cart_04@getnada.com| |Test@123|   |Mac (2)|
    
    
    