Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
 Given User is on Login Page
 When User enters "<username>" as Username and "<password>" as Password
 Then Message displayed Login Successfully
Examples:
    | username   | password |
    | ali        | admin    |
    | admin      | @dmin111 |
 
Scenario: Successful LogOut
 When User LogOut from the Application
  Then Message displayed LogOut Successfull