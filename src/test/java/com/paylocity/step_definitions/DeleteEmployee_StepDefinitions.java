package com.paylocity.step_definitions;

import com.paylocity.pages.DeleteEmployeePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteEmployee_StepDefinitions {

    DeleteEmployeePage deleteEmployeePage = new DeleteEmployeePage();

    @When("Employer click on the Delete Action button")
    public void employerClickOnTheDeleteActionButton() {

        DeleteEmployeePage.deleteActionButton.click();
    }

    @Then("Employer click on the Delete button")
    public void employerClickOnTheDeleteButton() {
        DeleteEmployeePage.deleteButton.click();
    }

    @Then("the Employee should be deleted")
    public void the_employee_should_be_deleted(String string) {
/*
        String actualMessageText = deleteEmployeePage.messageDisplayed.getText();
        String expectedMessageText= "No employees found.";

        //Checking the context of the web element
        Assert.assertTrue(actualMessageText.equalsIgnoreCase(expectedMessageText));

        //Checking if the web element displayed or not
        Assert.assertTrue(deleteEmployeePage.messageDisplayed.isDisplayed());
*/
    }



}

