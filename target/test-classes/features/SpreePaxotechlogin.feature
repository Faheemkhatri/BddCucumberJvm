Feature: Spree project login functionality

@functionality
 Scenario Outline: 1. As a valid user, user should be able to login.
  
    Given user can browse to an application
    When user land on home page "Spree Demo Site"
    Then user can click on login link
    And enter "<email>" as email address
    And enter "<password>" as password
    And click on login button
    When user logged on to the application
    Then user can click on account link
    And verify email "<signInEmail>" as signed in text
    And click on log out button
    And verify log out text "<signOutText>" as signed out message

Examples:

  |email	|password| signInEmail	| signOutText|
  
  |akhatrifahim@gmail.com|	student|	akhatrifahim@gmail.com (Edit)|	Signed out successfully.|
  |faheemkhatri@yahoo.com|	student1|	faheemkhatri@yahoo.com (Edit)|  Signed out successfully.|

@smoke  
Scenario: 2. As a valid user, user should be able to login and buy a product.
Given user can browse to an application
	When user land on home page "Spree Demo Site"
	Then user can click on login link
	And enter "faheemkhatri@yahoo.com" as email address
	And enter "student1" as password
	And click on login button
	When user logged on to the application
	Then select item "Ruby on Rails Tote"
	And update quantity on cart page
	And click on add to cart button
	And click on check out button