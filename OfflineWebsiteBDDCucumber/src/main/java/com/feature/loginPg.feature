Feature: JBK Offline Application Login Page


Scenario: Verify Url of Login Page

Given user should be on login page
Then user will get same expected and actual Url 


Scenario: Verify Title of Login Page

Given user should be on login page
Then user will get same expected and actual Title 


Scenario: Verify Logo of Login Page

Given user should be on login page
Then user will be able to see the Logo


Scenario: Verify Heading of Login Page

Given user should be on login page
Then user will get same expected and actual Heading


Scenario: Verify subHeading of Login Page

Given user should be on login page
Then user will get same expected and actual subHeading


Scenario: Verify signIn Box Heading of Login Page

Given user should be on login page
Then user will get same expected and actual signIn Box Heading


Scenario: Verify Placeholders of Login Page

Given user should be on login page
Then user will get same expected and actual Placeholders


Scenario: Login with valid Data

Given user should be on login page
When user enters valid data
Then user will be on Dashboard page


Scenario: Verify logout Successfully Message

Given user should be on login page
When user enters valid data
Then user should be on Dashboard page
When clicks logout button
Then user should be able to see logout Successfully Message on Login page


Scenario: Verify Invalid LogIn Error Messages

Given user should be on login page
When user enters invalid data
Then user will get same expected and actual Invalid LogIn Error Messages


Scenario: Verify Blank LogIn Error Messages

Given user should be on login page
When user enters no data
Then user will get same expected and actual Blank Log In Error Messages


Scenario: Verify Register Link Text of Login Page

Given user should be on login page
Then user will get same expected and actual Register Link Text


Scenario: Verify Register Link of Login Page

Given user should be on login page
When user clicks on Register Link
Then user should be on register page


Scenario Outline: Login with Invalid Data

Given user should be on login page
When user enters invalid "<username>" and "<password>"
Then user will be on Login page

Examples:
|username             |password       |
|neelam@gmail.com     |123456         |
|mangesh@gmail.com    |qwerty         |
|akshay@gmail.com     |asdfgh         |


Scenario: Verify Login Data

Given user should be on login page
When user enters email, password and clicks on Login Button
Then user will get to know weather data is valid or not