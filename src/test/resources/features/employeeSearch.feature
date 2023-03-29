Feature: Employee Search


  Background:
    When user enters with valid username and password
    And user click on login Button
    And user navigates to employee list page
  @regression
  Scenario: Search employee by id
    When user enters valid employee id
    Then user see employee information is displayed
@sprint2
    Scenario: search employee by name
      And user enters valid employee name
      And click on search button
      Then user see employee information is displayed