Feature: Registration page testing

  Scenario: User registration scenario
    Given User is on "Chrome" browser and enter Registration page "https://demo.nopcommerce.com/"
    When User enter all details
    And user click on register button
    Then User registered
