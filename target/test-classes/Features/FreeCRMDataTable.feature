Feature: FreeCRM login Validation with DataTable

Scenario: Verification of Login functionality

Given the user is on home page
When the user fills username and password
|denghosh|Walmart$1|

And the user clicks on button
Then the user successfully logins

