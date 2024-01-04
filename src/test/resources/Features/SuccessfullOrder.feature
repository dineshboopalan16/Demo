Feature: To test the login functionality for sauce demo web page

@E2ETest
Scenario Outline: To check the successful login

Given User launches saucedemo webpage
When User enter "<username>"
And  User enters "<password>"
Then User clicks on login button
Then User navigates to home page
Then User added the product "<productname>" to the cart
Then User clicked on Cart icon
Then User verifed that added product name is displayed correctly in the cart screen
Then User clicked on Checkout
Then User provided "<firstname>" "<secondname>" "<postalcode>" in the checkout page
Then User click on continue
Then User verifed that added product name is displayed correctly in the checkout screen
Then User clicks on finish 
Then User verifies the order confirmation message


Examples:
|username        | |password    | |productname        | |firstname| |secondname| |postalcode|
|standard_user   | |secret_sauce| |Sauce Labs Backpack| |Dinesh   | |Boopalan  | |HA97HA    |
|locked_out_user | |secret_sauce| |Sauce Labs Backpack| |Dinesh   | |Boopalan  | |HA97HA    |
