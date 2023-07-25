package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginPageFunctionality {
    @And("Enter Email Id {string}")
    public void enterEmailId(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("Enter Password {string}")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("Click On Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify Message and Links {string}")
    public void verifyMessageAndLinks(String MessageAndLink) {
        if(MessageAndLink.equals("Login was unsuccessful. Please correct the errors and try again.\n" +"No customer account found"))
        {
            Assert.assertEquals("Login Was Unsuccessfully",MessageAndLink,new LoginPage().verifyErrorMessage());
        }
        else if(MessageAndLink.equals(" Logout"))
        {
            new LoginPage().isLogoutLinkDisplayed();
        }
        else
        {
            new LoginPage().getlogOutlink();
            new LoginPage().isLoginLinkDisplayed();
        }

    }
}
