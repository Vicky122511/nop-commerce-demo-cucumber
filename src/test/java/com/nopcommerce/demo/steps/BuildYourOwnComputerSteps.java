package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BuildYourOwnComputerSteps {
    @And("ClickOn Product Name Build Your computer")
    public void clickonProductNameBuildYourComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("Select Processor {string}")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("Select Ram {string}")
    public void selectRam(String ram) {
            new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDDRadios(hdd);
    }

    @And("Select OS  {string}")
    public void selectOS(String os) {
        new BuildYourOwnComputerPage().selectOSRadios(os);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("Click On Add To Cart Button")
    public void clickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("Verify The Message {string}")
    public void verifyTheMessage(String msg) {
        Assert.assertEquals("Add to cart Header Message Not Matched",msg,new BuildYourOwnComputerPage().verifyTheProductAddedToYourCart());
    }
}
