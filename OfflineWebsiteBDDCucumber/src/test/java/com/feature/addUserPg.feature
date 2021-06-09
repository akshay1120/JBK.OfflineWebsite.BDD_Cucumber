Feature: JBK Offline Application Add User Page


Scenario: add user test

Given user should be on add user page
When user enters all details
Then actual and expected alert message should match



Scenario: Verify Drag Down options of State menu on Add User Page

Given user should be on add user page
When user select the State Menu
Then actual and expected Drag Down options should match