Feature: JBK offline application Useful Links Page


Scenario: Verify all click Go options

Given User should be on Useful Links Page
When User clicks on all Go buttons one by one 
Then Actual and expected title of new windows should match


Scenario: Verify complete Useful Links Table

Given User should be on Useful Links Page
Then Actual and expected Useful Links table should match