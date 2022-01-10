Feature: Dell Login

Scenario: Verify User Can Login


Given Launch Dell "<URL>"
Then Click Signin Option & Click on Signin
Then Enter Username & Enter Password & Click Signin Button
And Verify Profile Page