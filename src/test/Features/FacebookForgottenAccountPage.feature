Feature: Forgotten Account page
  Scenario: Verify title name
    Given I access facebook URL
    When I click on the link "Forgotten Account"
    Then I see title as "Find Your Account"

    Scenario Outline: Verify all fields on "Forgotten Account" page
      Given I access facebook URL
      When I click on the link "Forgotten Account"
      Then I see "<fields>" exists
      Examples:
      |fields|
      |PhoneOREmail|
      |SearchButton   |
      |CancelButton   |

      Scenario Outline: Verfiy account search
        Given I access the link "Forgotten Account"
        When I enter the "<PhoneNo>" or "<Email>"
        And I click on "Search" button
        Then I can reset my account
        Examples:
        |PhoneNo|Email|
        |176176316||
        |         |abc@abc.abc|

  Scenario Outline: Verfiy cancel button
    Given I access the link "Forgotten Account"
    When I enter the "<PhoneNo>" or "<Email>"
    And I click on "cancel" button
    Then I cannot reset my account
    Examples:
      |PhoneNo|Email|
      |176176316||
      |         |abc@abc.abc|


