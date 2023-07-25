package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerPageSteps {
    @Given("User should on Home Page")
    public void userShouldOnHomePage() {
    }

    @When("Click On Computer Tab")
    public void clickOnComputerTab() {
        new ComputerPage().clickonMenu();
    }

    @Then("Verify Computer Page Header {string}")
    public void verifyComputerPageHeader(String text) {
        Assert.assertEquals("Computer Header Text Not Match",text,new ComputerPage().verifyComputeHeaderText());

    }

    @And("Click On Desktop Link")
    public void clickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("Verify Desktop Page Header {string}")
    public void verifyDesktopPageHeader(String desk) {
        Assert.assertEquals("Desktop Header Text Not Matched",desk,new ComputerPage().verifyDesktopHeader());
    }
}
