package com.paylocity.step_definitions;

import com.paylocity.pages.EmployeeFunctionsPage;
import com.paylocity.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class DeleteEmployee_StepDefinitions {

    EmployeeFunctionsPage employeeFunctionsPage = new EmployeeFunctionsPage();

    @When("Employer click on the Delete Action button")
    public void employerClickOnTheDeleteActionButton() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        employeeFunctionsPage.deleteActionButton.click();
    }

    @Then("Employer click on the Delete button")
    public void employerClickOnTheDeleteButton() {
        //Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        employeeFunctionsPage.deleteButton.click();

        }

    @Then("the Employee should be deleted")
    public void theEmployeeShouldBeDeleted() {

        String actualMessageText = employeeFunctionsPage.messageDisplayed.getText();
        String expectedMessageText = "No employees found.";

        //Checking the context of the web element
        Assert.assertTrue(actualMessageText.equalsIgnoreCase(expectedMessageText));

        //Checking if the web element displayed or not
        Assert.assertTrue(employeeFunctionsPage.messageDisplayed.isDisplayed());

/*
        //6. Print out count of all the links on landing page
        List<WebElement> allFirstNames = Driver.getDriver().findElements(By.xpath("//tr/td[2]"));
        //(By.xpath("//body"));          ("//tr/td[2]"));

        System.out.println("All Employees are in this page: " + allFirstNames.size());

        //7. Print out each link text on this page
        for (WebElement each : allFirstNames) {

            System.out.println("eachLink = "+each.getText());

            Assert.assertFalse(each.getText().equalsIgnoreCase("Steve"));
           // Assert.assertTrue(!each.getText().equals("Mark"));
        }


 */





        // Driver.closeDriver();
    }


    }




