Feature:twitter sign up

Scenario Outline:


Given user visit twitter signupurl
When user click signup with phoneor email address
When user type  "<name>", "<phone number>",and select date of birth
When user click on next ,again clickon next and click signup
Then user will able to sign up account 

Examples:


|name         |phone number|
|Meharun zaman|8636172284|
