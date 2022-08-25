Feature:twitter sign up

Scenario Outline:


Given users visits twitter signup url
When user click signup with phone or email address
When user types  "<name>", "<email address>",and select date of birth
When user click next ,again click next and click signup
Then user will able to sign up 

Examples:
|name |email address |
|Meharun zaman|meherun.athina@gmail.com|
