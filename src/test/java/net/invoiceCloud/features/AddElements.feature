
Feature: Verify the Add Element functionality

  @Functional
  Scenario Outline: Verify element count matches
    Given I navigate to the system
    And I add random numer of Elements to the page
    Then I validate Element count matches with the added elements

 