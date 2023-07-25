package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserShouldNavigateLoginPageStep {
    @Given("User should on Login Page")
    public void userShouldOnLoginPage() {

    }

    @When("Click On Login Link")
    public void clickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("Verify welcome text {string}")
    public void verifyWelcomeText(String welcomeText) {
        Assert.assertEquals("WelCome Text Header Text Not Matched",welcomeText,new LoginPage().verifyWelComeMSG());
    }
}
