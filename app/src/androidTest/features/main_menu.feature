Feature: See all portfolio options

  Scenario: select POPULAR MOVIES option
    Given I wait for the "ButtonsMenuActivity" screen to appear
    When I press the "POPULAR MOVIES" button
    Then I should see "This button will launch my Popular Movies app!"

  Scenario: select FOOTBALL SCORES APP option
    Given I wait for the "ButtonsMenuActivity" screen to appear
    When I press the "FOOTBALL SCORES APP" button
    Then I should see "This button will launch my Football Scores app!"

  Scenario: select LIBRARY APP option
    Given I wait for the "ButtonsMenuActivity" screen to appear
    When I press the "LIBRARY APP" button
    Then I should see "This button will launch my Library app!"

  Scenario: select BUILD IT BIGGER APP option
    Given I wait for the "ButtonsMenuActivity" screen to appear
    When I press the "BUILD IT BIGGER" button
    Then I should see "This button will launch my Build it bigger app!"

  Scenario: select XYZ Reader APP option
    Given I wait for the "ButtonsMenuActivity" screen to appear
    When I press the "XYZ READER" button
    Then I should see "This button will launch my XYZ Reader app!"

  Scenario: select CAPSTONE APP option
    Given I wait for the "ButtonsMenuActivity" screen to appear
    When I press the "CAPSTONE: MY OWN PROJECT" button
    Then I should see "This button will launch my Capstone app!"