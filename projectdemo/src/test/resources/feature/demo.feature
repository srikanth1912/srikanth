Feature: saucedemo

@tc_01_login
Scenario Outline: Login with valid credentials
Given User Launch Chrome browser
When Login Saucedemo page opened
And User enters email as "<email>" and password as "<password>"
And click on Login
And Close Browser

   Examples:
         |email           | password         |
         |standard_user   | secret_sauce     |
         |locked_out_us | secret_sauce     |
        
 
 
@tc_2_addtocart
Scenario: Add items to cart
  Given User launch Chrome Browser
  When Page is opened
  Then Add items to cart
  And Close browser

@tc_3_continueshopping
Scenario: continue shopping
Given User Launch Chrome Browser
When page is opened
Then Add items to the cart
And Continue shopping
Then Add items to the cart
And Close the browser

@tc_4_remove
Scenario: remove from cart
Given  User Launch Chrome Browserr
When page is openedd
Then Add items to the cartt
And Remove 
And close the browser

@tc_5_logout
Scenario: Logout
Given  Userr Launch Chrome Browserr
When Page is openedd
Then Click on Menu
And select the logout
And close the browser


@tc_6_checkoutc
Scenario: Checkout
Given  Userr Launchh Chrome Browserr
When Pagee is openedd
Then Add the product to cart
And click on cart
And click on checkout and give frstname as "srikanth" and lastname as "reddy" and zipcode as "23145"
And closee the browser 

@tc_7_datadrivenlogin
Scenario: login throuugh excel
Given  Launch Chrome Browserr
When Login Saucedemo page openedd
Then enter the email and pass
Then click on login buttonn
And close  browser


 


