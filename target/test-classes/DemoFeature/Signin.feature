Feature: Dell Signin



Scenario: Verify User Can Login

Given Launch Dell "<URL>"
Then Click Signin Option and Click on Signin
Then Enter Username and Enter Password and Click Signin Button
And Verify Profile Page