Feature: verifying facebook login details

  Scenario Outline: Verifying facebook login with valid data
  Given User is on the facebook page
  When User enters "<username>" and "<password>"
  And User click the login button
  Then User should verify after login success message
  
  Examples:
  | username   | password     |
  | greens     | Java@123     |

  #
  #Scenario: Verifying amazon page product search
  #Given User is on the amazon page
  #When User search product
  #| Tv      |
  #| Laptop  |
  #| android |
  #| ios     |
  #Then User Should verify all product listed
  #
  #Scenario: Verifying amazon page product search with two
  #Given User is on the amazon page
  #When User search product
  #| Tv      | sony     |
  #| Laptop  | thinkpad |
  #| android | oneplus  |
  #| ios     | iphone   |
  #Then User Should verify all product listed
  #
  #Scenario: Verifying facebook login with valid data one
  #Given User is on the facebook page
  #When User login
  #| Tv      | sony     |
  #| Laptop  | thinkpad |
  #| android | oneplus  |
  #| ios     | iphone   |
  #Then User should verify after login success message
  #
  #Scenario: Verifying facebook login with valid data two
  #Given User is on the facebook page
  #When User login with two di
  #| username | password |
  #| Tv       | sony     |
  #| Laptop   | thinkpad |
  #| android  | oneplus  |
  #| ios      | iphone   |
  #Then User should verify after login success message
  #@tag1
  #Scenario: verifying facebook and takescreen shot
  #When user login face book
  #Then user verify facebook page
  
