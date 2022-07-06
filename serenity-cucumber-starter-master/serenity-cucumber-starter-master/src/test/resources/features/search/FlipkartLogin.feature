Feature: Flipkart Login

@Functional
Scenario: Login with valid credentials
Given User is on login page
When User enter the Mobile Number
When User enter the Password
Then User Should be able to login


#Scenario: Product adding to cart and verify 
Given User is on Dash Page
When User search a product 
And User open the product
Then User add that product to cart
And User Verify the Product