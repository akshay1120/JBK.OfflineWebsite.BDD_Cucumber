Feature: JBK Offline Application Users Page


Scenario: Verifying Users Page Table Heading with ArrayList

Given user should be on user page
Then actual and expected table headings of users page should match


Scenario: Verifying Users Page User names in alphabetical order

Given user should be on user page
When user sort the user names according to alphabetical order
Then actual and expected list of user names should match


Scenario: Verifying Users Page Click delete button Alert Messages List

Given user should be on user page
When User clicks on all delete button one by one 
Then actual and expected list of Alert messages should match


Scenario: Verifying Users Page Table Heading with Excel

Given user should be on user page
Then actual and expected table headings of users page using excel should match