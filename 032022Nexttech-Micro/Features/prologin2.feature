Feature:twitter sign in validation

Scenario Outline:


Given user visit twitter login URL
When user type  "<email>"
When user click on next
When user type "<pw>" and click login
Then user will be able to login successfully

Examples:
|email                   |pw|
|meherun.athina@gmail.com|Athi12345|