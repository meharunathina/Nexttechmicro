Feature:google review validation

Scenario Outline:

Given user go to google homepage

When user types "<company name>" and click searchicon

When user scroll down and click write a review

When user type "<review>" and click star icon

When user click post

Then user able to post a review

Examples:
|company name|review                  |
|nexttech itc|nexttech itc is the best|