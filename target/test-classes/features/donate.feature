@regression
Feature: Donate Home Page Functionality

#  Background:

  Scenario: Donate Home Page Verification
    Then verify title "Donate Today | The American Cancer Society" is enabled – true
    And verify background image "url(\"https://acsdonateqaimages.azureedge.net/media/ACS18_029545_Michelle_Quint_Opt.png\")" is displayed - true
    And verify logo image is displayed
    And verify text "Give the gift of cancer research and patient support." is displayed
    And click on One Time and verify the following values are displayed
      | $50 | $75 | $100 | $250 |
    And click on Monthly and verify the following values are displayed
      | $21 | $50 | $100 | $250 |

