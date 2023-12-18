@PhaseTwo
Feature: Tasks CRUD management

@Smoketest
Scenario: Create a new Tasks
Given User is logged in
When User create a new Tasks


Scenario: View a Tasks
Given User is logged in
When User view Tasks details

@Regressiontest
Scenario: Delete a Tasks
Given User is logged in
When User delete a Tasks
 
