package com.paylocity.step_definitions;

import com.paylocity.pages.EditEmployeePage;
import com.paylocity.pages.EmployeeFunctionsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EditEmployee_StepDefinitions {

    EditEmployeePage editEmployeePage = new EditEmployeePage();

    @When("Employer select the Action Edit")
    public void employer_select_the_action_edit() {


        EditEmployeePage.editEmployeeButton.click();
    }


    @Then("Employer should be able to change First Name Steve to {string}")
    public void employerShouldBeAbleToChangeFirstNameSteveTo(String string) {
        EditEmployeePage.editFirstName.sendKeys(string);
    }

    @Then("Employer should be able to change Last Name Jobs to {string}")
    public void employer_should_be_able_to_change_last_name_jobs_to(String string) {
        EditEmployeePage.editLastName.sendKeys(string);
    }

    @Then("Employer should be able to change Dependents {int} to {string}")
    public void employer_should_be_able_to_change_dependents_to(Integer int1, String string) {
        EditEmployeePage.editDependants.sendKeys(string);
    }

    @Then("Employer should be able to click on Update button")
    public void employerShouldBeAbleToClickOnUpdateButton() {
        EditEmployeePage.updateEmployeeButton.click();
    }

    @Then("the data should change in the table")
    public void the_data_should_change_in_the_table() {

/*
        String actualEmployee =EditEmployeePage.updatedEmployeeIsOnTheTable.getText();
                //editEmployeePage.employeeIsOnTheTable.getText();
        String expectedEmployee = "SteveMark";

        //Checking the context of the web element
        Assert.assertTrue(actualEmployee.equalsIgnoreCase(expectedEmployee));

        //Checking if the web element displayed or not
        Assert.assertTrue(EditEmployeePage.updatedEmployeeIsOnTheTable.isDisplayed());

        String actualEmployee1 = EmployeeFunctionsPage.lastNameIsOnTheTable.getText();
        String expectedEmployee1= "Jobs";

        //Checking the context of the web element
        Assert.assertTrue(actualEmployee1.equalsIgnoreCase(expectedEmployee1));

        //Checking if the web element displayed or not
        Assert.assertTrue(EmployeeFunctionsPage.lastNameIsOnTheTable.isDisplayed());

*/
    }



}
