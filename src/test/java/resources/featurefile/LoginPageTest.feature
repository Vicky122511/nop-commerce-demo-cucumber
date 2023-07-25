@regression

Feature: Check Login Page Functionality

  @smoke
  Scenario: User Should Navigate To Login Page SuccessFully

    Given User should on Login Page
    When  Click On Login Link
    Then  Verify welcome text "Welcome, Please Sign In!"

  @sanity
  Scenario Outline: Verify Login Page Functionality with Diffrent Credential

    Given User should on Login Page
    When  Click On Login Link
    And   Enter Email Id "<email>"
    And   Enter Password "<password>"
    And   Click On Login Button
    Then  Verify Message and Links "<MessageAndLink>"

    Examples:
      | email                     | password | MessageAndLink                                                                               |
      | vicky.shah7928@yahoo.com  | 123@abc  |Login was unsuccessful. Please correct the errors and try again.\nNo customer account found|
      | vicky.shah79281@yahoo.com | abc@1234 | Logout|
      | vicky.shah79281@yahoo.com | abc@1234 | Check|



