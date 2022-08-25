Feature:  home depot search

Scenario Outline:  home depot search

Given user visits home depot homepage,
When user types "<productname>" and click search icon
Then User should be able to see the expected product

Examples:
 |productname| 
 | duracell optimum AAA |