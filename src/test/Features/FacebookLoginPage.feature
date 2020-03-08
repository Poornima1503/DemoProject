Feature: Facebook Login Page
  Scenario Outline: Verify Title name
    Given I am a Chrome user
    When I access "<website>" home page
    Then I see title as "<titleName>"
    Examples:
      |website|titleName|
      |Facebook|facebook |
      |Booking |booking  |

  Scenario Outline: Verify all the text fields in home page
    Given I am a Chrome user
    When I access Facebook home page
    Then I see "<fieldName>" exists
    Examples:
      |fieldName|
      |Email or Phone|
      |Password      |
      |FirstName     |
      |SurName       |
      |Mobile number or email address|
      |New password                  |

  Scenario Outline: Verify all the other fields in home page
    Given I am a Chrome user
    When I access Facebook home page
    Then I see "<OtherFields>" exists
    Examples:
      |OtherFields|
      |LogInButton     |
      |ForgottenAccountLink|
      |BirthdayDay  |
      |BirthMonth   |
      |BirthYear    |
      |GenderFemale |
      |GenderMale   |
      |GenderCustom |
      |SignUpButton |
      |createPageLink|

  Scenario Outline: Verify all the language links
    Given I am a Chrome user
    When I access Facebook home page
    Then I see link for "<Language>"
    Examples:
      |English UK|
      |Polski    |
      |Espanol   |
      |Francais  |
      |Italiano|
      |Lietuvių|
      |Romana  |
      |Português (Brasil)|
      |Deutsch           |


  Scenario Outline: Verify all other links
    Given I am a Chrome user
    When I access Facebook home page
    Then I see all "<other>" links
    Examples:
      |other|
      |Sign Up|
      |Log In |
      |Messenger|
      |Facebook Lite|
      |Watch        |
      |People       |
      |Pages        |
      |Page Categories|
      |Places         |
      |Games          |
      |Locations|

  Scenario Outline: Verify create new account
    Given I access facebook URL
    When I enter "<First Name>","<Surname>","<emailAddress>","<NewPassword>","<DOB>", "<Gender>"
    And I click "SignUp" button
    Then I see new account created succesfully
    Examples:
      |First Name|Surname|emailAddress|NewPassword|DOB|Gender|
      |Firstname1     |Surname1|fs1@abc.abc|password1|01-01-2000|Female|
      |Firstname2     |Surname2|fs2@abc.abc|password2|01-02-2010|Male |








