Feature: test Kotlin with the cucumber

  @ScenarioId("AppPortfolio-showcase") @UserStory("IfWeUseIt") @showcase-scenarios
  Scenario: Test message of Popular Movies option
    Given I Am on Portfolio app
    When I click on Popular Movie Button
    Then I should see "This button will launch my Popular Movies app!"