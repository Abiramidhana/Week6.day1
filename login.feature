Feature: LeafTaps login functionality

Scenario: Login with Positive credential
Given Open the chrome browser
And Load the application url 
And Enter the username as DemosalesManager
And Enter the password as crmsfa
When Click on Login button
Then Homepage should be displayed

