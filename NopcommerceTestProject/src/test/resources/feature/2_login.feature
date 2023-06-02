Feature: Login Scenario
 Scenario Outline: Login using Valid Login details
    Given User on "Chrome" browser and homepage"https://demo.nopcommerce.com/login?returnUrl=%2F"
    When User enter valid "<username>" and "<password>"
    Then User should login successfully
   Examples:
     | username         | password |
     | Kalpesh@gmai.com | Lukhi    |
     | Kalpesh@.com     | Patel    |
     | Lukhi            |Kalpesh   |


