Feature: Dashboard tab functionality

@dashboardtabs
Scenario: Dashboard tab verification
  When user enters valid ess username and password
  And user clicks on login Button
  And ess user is successfully login
Then verify the following tabs on dashboard
|Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|