package com.paylocity.step_definitions;

import com.paylocity.pages.EmployeeFunctionsPage;
import com.paylocity.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class EditEmployee_StepDefinitions {

    EmployeeFunctionsPage employeeFunctionsPage = new EmployeeFunctionsPage();

    @When("Employer select the Action Edit")
    public void employer_select_the_action_edit() {

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        employeeFunctionsPage.editEmployeeButton.click();
    }


    @Then("Employer should be able to change First Name Steve to {string}")
    public void employerShouldBeAbleToChangeFirstNameSteveTo(String string) {
        employeeFunctionsPage.editFirstName.clear();
        employeeFunctionsPage.editFirstName.sendKeys(string);
    }

    @Then("Employer should be able to change Last Name Jobs to {string}")
    public void employer_should_be_able_to_change_last_name_jobs_to(String string) {
        employeeFunctionsPage.editLastName.clear();
        employeeFunctionsPage.editLastName.sendKeys(string);
    }

    @Then("Employer should be able to change Dependents {int} to {string}")
    public void employer_should_be_able_to_change_dependents_to(Integer int1, String string) {
        EmployeeFunctionsPage.editDependants.clear();
        EmployeeFunctionsPage.editDependants.sendKeys(string);
    }

    @Then("Employer should be able to click on Update button")
    public void employerShouldBeAbleToClickOnUpdateButton() {
        employeeFunctionsPage.updateEmployeeButton.click();
    }

   // @Then("the data should change in the table")
   // public void the_data_should_change_in_the_table() {

   // }

    }




