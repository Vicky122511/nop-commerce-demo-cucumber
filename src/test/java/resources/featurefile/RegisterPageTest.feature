@regression

Feature: Check Register Page Functionality

  @sanity
  Scenario: Verify that User should Navigate to Register Page Successfully
    Given   Click On Register Link
    Then    Verify Register Text "Register"

    @smoke
    Scenario: Verify that all Mendetory Field require on Register Page
      Given Click On Register Link
      When  Click On Register Button
      Then  Verify First Name Error Message "First name is required."
      Then  Verify Last Name Error Message  "Last name is required."
      Then  Verify Email Error Message  "Email is required."
      Then  Verify Password Error Message "Password is required."
      Then  Verify Confirm Password Error Message "Password is required."

      @smoke
      Scenario: Verify That User should Create Account Successfully
        Given   Click On Register Link
        When    Select Gender "Female"
        And     Enter First Name "Vicky"
        And     Enter Last Name "Shah"
        And     Select Day "10"
        And     Select Month  "March"
        And     Select Year "1988"
        And     Enter Email "vicky.shah79283@yahoo.com"
        And     Enter Password for Register "abc@1234"
        And     Enter Confirm Password "abc@1234"
        And     Click On Register Button
        Then    Verify Message "Register"
