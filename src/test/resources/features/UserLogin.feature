Feature: User Login feature

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then should display success Msg

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then should display success Msg

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then should display success Msg

#Examples:
 #    | username | password |
  #   | tomsmith | SuperSecretPassword! |
   #  | testuser1 | welcome123 |
    # | testuser2 | welcome123 |
    
Scenario: Valid Login
Given User is on Login Page
When User enters credentials 
      |tomsmith | SuperSecretPassword! |
Then should display success Msg
    
    