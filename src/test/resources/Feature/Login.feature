Feature: verifying facebook login details

  Scenario Outline: verifying facebook login with valid data
    Given user is on the facebook page
    When user enters "<username>" and "<password>"
    And user click the login button
    Then user should verify after login success message

    Examples: 
      | username   | password     |
      | greens     | Java@123     |
      | greensomr  | selenium@123 |
      | grensporur | maven@123    |
