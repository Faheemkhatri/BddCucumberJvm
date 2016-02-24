Feature: Spree project login functionality

Scenario: 1. As a valid user, user should be able to login.
Given user can browse to an application
	When user land on home page "Spree Demo Site"
	Then user can click on login link
	And enter "akhatrifahim@gmail.com" as email address
	And enter "student" as password
	And click on login button
	When user logged on to the application
	Then user can click on account link
	And verify email "akhatrifahim@gmail.com (Edit)" as signed in text
	And click on log out button 
	And verify log out text "Signed out successfully." as signed out message