Feature: twitter sign in
Scenario Outline:

Given user visit twitter login 
When user type valid "<phone number>"
When user click on next
When user type valid "<pw>" and click login
Then user will be login successfully

Examples:
|phone number|pw       |
|4075616613  |Athi12345|