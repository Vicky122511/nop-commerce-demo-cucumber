package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Log out')]")
    WebElement  logOutlink;


    public boolean isLoginLinkDisplayed()
    {
        return loginLink.isDisplayed();
    }

    public void clickOnLoginLink()
    {
        clickOnElement(loginLink);
    }

    public void enterEmailId(String email1)
    {
        sendTextToElement(email,email1);
    }

    public void enterPassword(String pass)
    {
        sendTextToElement(password,pass);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }
    public String verifyWelComeMSG()
    {
        return getTextFromElement(welcomeText);
    }

    public String verifyErrorMessage()
    {
        return getTextFromElement(errorMessage);
    }

    public void getlogOutlink() {
        clickOnElement(logOutlink);
    }
    public boolean isLogoutLinkDisplayed()
    {
        return logOutlink.isDisplayed();
    }
}