Feature: TestMe app Regestration with valid data
    
  Scenario: senario for regestration
    Given user open browser and launches testme application
    When user clicks signup link
    When user enters user name as "useuseuse" in  field
    And user enters first name as "name" in  field
    And user enters last name as "last" in  field
    And user enters password "password" in  field
    And user enters conform password "password" in  field
    And user enter gender
    And user enters email address "email@gmail.com" in  field
    And user enters mobile number "8974561235" in  field
    And user enters dob "09/01/1990" in  field
    And user enters address "first floor" in  field
    And user select security question
    And user enters answer "blakish" in  field 
    Then user clicks regestration 
     