Feature: LeafTaps login functionality

Scenario: Login with Positive credential
Given Open the chrome browser
And Load the application url 
And Enter the username as DemosalesManager
And Enter the password as crmsfa
When Click on Login button
And click on CRM/SFA
And click the Lead
And Find the Leads Button
And Find the Phone 
Given Enter the phone no
When click the Find leads button
#When Get the Value 
#When click the value
#When click the Delete
#When click the FindLeads
#Given the LeadId
#When Find the Leads
#But text is not equal
