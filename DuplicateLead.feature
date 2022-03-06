Feature: LeafTaps Duplicate lead

Scenario Outline: Find the Duplicate Lead
Given Open the chrome browser
And Load the application url 
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
And click on CRM/SFA
And click the Lead
And Find the Leads Button
And Find the Phone 
Given Enter the phone no
When click the Find leads button
And click the first text
And click the Duplicate lead
And click the submit button
Examples:
|'DemosalesManager'|'crmsfa'|