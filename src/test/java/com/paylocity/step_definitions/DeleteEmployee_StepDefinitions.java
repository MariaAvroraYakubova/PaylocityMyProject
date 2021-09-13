package com.paylocity.step_definitions;

import com.paylocity.pages.EmployeeFunctionsPage;
import com.paylocity.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DeleteEmployee_StepDefinitions {

    EmployeeFunctionsPage deleteEmployeePage = new EmployeeFunctionsPage();

    @When("Employer click on the Delete Action button")
    public void employerClickOnTheDeleteActionButton() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        EmployeeFunctionsPage.deleteActionButton.click();
    }

    @Then("Employer click on the Delete button")
    public void employerClickOnTheDeleteButton() {
        EmployeeFunctionsPage.deleteButton.click();
    }

    @Then("the Employee should be deleted and see the message {string}")
    public void theEmployeeShouldBeDeletedAndSeeTheMessage(String string) {

        EmployeeFunctionsPage.messageDisplayed.isDisplayed();

        String actualMessageText = deleteEmployeePage.messageDisplayed.getText();
        String expectedMessageText = "No employees found.";

        //Checking the context of the web element
        Assert.assertTrue(actualMessageText.equalsIgnoreCase(expectedMessageText));

        //Checking if the web element displayed or not
        Assert.assertTrue(deleteEmployeePage.messageDisplayed.isDisplayed());

       // Driver.closeDriver();
    }

}



