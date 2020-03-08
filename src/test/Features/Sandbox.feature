Feature: Test
  Scenario Outline: Verify create new account
    Given I access facebook
    When I enter "<First Name>","<Surname>","<emailAddress>","<NewPassword>","<DOB>","<Gender>"
    And I click "SignUp" button
    Then I see new account created succesfully
    Examples:
      |First Name|Surname|emailAddress|NewPassword|DOB|Gender|
      |Firstname1     |Surname1|fs1@abc.abc|password1|01012000|Female|
      |Firstname2     |Surname2|fs2@abc.abc|password2|01022010|Male |
