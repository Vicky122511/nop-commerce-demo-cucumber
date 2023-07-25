package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterPageFunctionalitySteps {
    @Given("Click On Register Link")
    public void clickOnRegisterLink() {
        new RegisterPage().clickOnRegisterLink();
    }

    @Then("Verify Register Text {string}")
    public void verifyRegisterText(String register) {
        Assert.assertEquals("Register Header Text Not Matched",register,new RegisterPage().verifyRegisterHeader());
    }

    @When("Click On Register Button")
    public void clickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("Verify First Name Error Message {string}")
    public void verifyFirstNameErrorMessage(String firstError) {
        new RegisterPage().errorFirstNameDisplayed();
    }

    @Then("Verify Last Name Error Message  {string}")
    public void verifyLastNameErrorMessage(String lastError) {
        new RegisterPage().errorLastNameDisplayed();
    }

    @Then("Verify Email Error Message  {string}")
    public void verifyEmailErrorMessage(String emailErro) {
        new RegisterPage().errorEmailDisplayed();
    }

    @Then("Verify Password Error Message {string}")
    public void verifyPasswordErrorMessage(String passError) {
        new RegisterPage().errorPasswordDisplayed();
    }

    @Then("Verify Confirm Password Error Message {string}")
    public void verifyConfirmPasswordErrorMessage(String conError) {
        new RegisterPage().errorConfirmDisplayed();
    }

    @When("Select Gender {string}")
    public void selectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("Enter First Name {string}")
    public void enterFirstName(String fName) {
        new RegisterPage().enterFirstName(fName);
    }

    @And("Enter Last Name {string}")
    public void enterLastName(String lName) {
        new RegisterPage().enterLastName(lName);
    }

    @And("Select Day {string}")
    public void selectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("Select Month  {string}")
    public void selectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("Select Year {string}")
    public void selectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("Enter Email {string}")
    public void enterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("Enter Password for Register {string}")
    public void enterPasswordForRegister(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("Enter Confirm Password {string}")
    public void enterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterCofirmPassword(confirmPassword);
    }

    @Then("Verify Message {string}")
    public void verifyMessage(String message) {
        Assert.assertEquals("Register",message,new RegisterPage().verifyRegisterHeader());
    }
}
