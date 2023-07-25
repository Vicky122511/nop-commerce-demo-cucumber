package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerHeader;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath ="//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebookLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwareLink;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopHeader;

    public void clickonMenu()
    {
        clickOnElement(computerLink);
    }
    public String verifyComputeHeaderText()
    {
        return getTextFromElement(computerHeader);
    }

    public void clickOnDesktopLink()
    {
        clickOnElement(desktopLink);
    }
    public void clickOnNotebookLink()
    {
        clickOnElement(notebookLink);
    }
    public void clickOnSoftwareLink()
    {
        clickOnElement(softwareLink);
    }
    public String verifyDesktopHeader()
    {
        return getTextFromElement(desktopHeader);
    }
}
