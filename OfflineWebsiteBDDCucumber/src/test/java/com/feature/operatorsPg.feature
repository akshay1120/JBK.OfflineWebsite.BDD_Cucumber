Feature: JBK Offline Application Operators Page


Scenario: Verify the contact no length of faculties

Given User should be on Operators Page
Then Actual and expected list of faculties having 10 digit contact number length should match


Scenario: Verify which faculties have phone call as preffered way to contact

Given User should be on Operators Page
Then Acual and expected list of faculties having phone call as preffered way to contact should match


Scenario: Verify complete Operators Table

Given User should be on Operators Page
Then Actual and expected users table should match