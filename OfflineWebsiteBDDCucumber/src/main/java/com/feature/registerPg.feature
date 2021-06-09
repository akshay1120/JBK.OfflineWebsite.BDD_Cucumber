Feature: JBK Offline Application Register Page


Scenario: Verify Url of Register Page

Given user should be on register page
Then user will get same expected and actual Url for Register Page


Scenario: Verify Title of Register Page

Given user should be on register page
Then user will get same expected and actual Title for Register Page


Scenario: Verify Heading of Register Page

Given user should be on register page
Then user will get same expected and actual Heading for Register Page


Scenario: Verify Already Member Text of Register Page

Given user should be on register page
Then user will get same expected and actual Already Member Text for Register Page


Scenario: Verify Already Member Link of Register Page

Given user should be on register page
When user clicks on Already Member Link
Then user should able to see LoginPage 


Scenario: Verify Placeholders of Register Page

Given user should be on register page
Then user will get same expected and actual Placeholders List for Register Page


Scenario: Verify Blank Sign In Error Messages of Register Page

Given user should be on register page
When user clicks on Sign In Button
Then user will get same expected and actual Blank Sign In Error Messages List for Register Page


Scenario: Verify Valid Sign In of Register Page

Given user should be on register page
When user enters all valid data 
And user clicks on Sign In Button
Then user should able to see alert message with text 'User registered successfully.'