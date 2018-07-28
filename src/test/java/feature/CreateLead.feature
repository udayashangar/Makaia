Feature: Lead in LeafTaps
#Given Open the browser
#And launch URL
#And Set Timeout
#And maximize the browser
Background: Login to LeafTaps and Navigate till Lead
Given enter the username as DemoSalesManager
And enter the password as crmsfa
And Click on Login Button
When Click on CRMSFA link
Then Click on Leads link

@Smoke
Scenario Outline: Create Lead
Given Click on CreateLead link
And enter company name as <cName>
And enter firstname as <fName>
And enter lastname as <lName>
When click on CreateLead button
Then Lead with firstname as <fName> is successfully created
Examples:
|cName|fName|lName|
|NMW|Uday|S|
#|RBS|Uday|S|

@Sanity
Scenario Outline: Edit Lead
Given Click Find leads
And Enter first name as <fName>
And Click Find leads button
And Click on first resulting lead
And Click Edit
And Verify title of the page
And Change the company name as <cName>
When Click Update
Then Lead with firstname as <fName> is successfully created
Examples:
|fName|cName|
|Uday|Amazon|

Scenario: Delete Lead

Given Click Find leads
And Click on Phone
And Enter phone number
And Click find leads button
And Capture lead ID of First Resulting lead
And Click First Resulting lead
And Click Delete
And Click Find leads
And Enter captured lead ID
When Click find leads button
Then Verify error msg

