Feature: As a User I should be able to book a flight

  Scenario: User should be able to book a one Way ticket

    Given User is on Landing Page
    When User chooses to travel by flight
    And user enters journey details
    Then user searches for flights

  Scenario: User should be able to book hotel

    Given User is on Landing Page
    When User chooses to book hotel

