@PhaseOne
Feature: Contacts CRUD management

@Smoketest @Regressiontest
Scenario: Create a new Contact
Given User is on loginpage
When User create a new contact

@Regressiontest
Scenario: View a Contact
Given User is on loginpage
When User view contact details


Scenario: Delete a Contact
Given User is on loginpage
When User delete a contact
 