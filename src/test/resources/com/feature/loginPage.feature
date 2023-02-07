

Feature: Login page
  I want to login to jarvis
  

 
  Scenario: Login screen
   Given user is on login page
    When user checks the falabellaImage
    And user enters email id "qa-settlements@jarvis.osmos.services"
    And user enters password "FbSettlements@2022"
    And user clicks on Sign in button
    Then user gets the title of the page
    And title of the page is "test"

    