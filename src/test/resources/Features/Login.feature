#Author
#Date
#Description
Feature: Login

  Scenario: Successful login with valid credentials
    Given User launch chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourestore.com" and password is "admin"
    And Click on login
    Then page title should be "Dashboard / nopCommerce "
    And  click on logout 
    Then Page title should be "Your store. Login"
    And User Close browser
