Feature:Adding employees
Background:
  When user enters with valid username and password
  And user clicks on login Button
  When user clicks on PIM option
  And user clicks on Add employee button
  And user clicks on save button option


  Scenario: Adding employee from add employee page
    And user enters firstname middlename and lastname

    @smoke
  Scenario: Adding employee from add employee page via feature file
    And user enters first name  "Nawin" middle name "Ib" and last name "rasikh"


  @example
  Scenario Outline: Adding employee from add employee page via feature multiple data
    And user enters "<FirstName>" "<MiddleName>" and "<LastName>" in the application

    Examples:
      | FirstName  | MiddleName | LastName |
      | Test123456 | MS         | Test9876 |
      | Test1212   | MS         | Test7654 |
      | Test3232   | MS         | Test5454 |

  @datatablewithheader
  Scenario: Adding multiple employees in a single execution
    When add multiple employees and verify they are added successfully
      | FirstName | MiddleName | LastName |
      | Jon0404   | MS         | US       |
      | Jack0404  | MS         | US       |
      | MS0909    | MS         | US       |
  @excel
  Scenario: Adding the employee from excel file
    When user adds multiple employees from excel file from "newdata" sheet and verify they are added