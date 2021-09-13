package com.paylocity.step_definitions;

import com.paylocity.pages.EmployeeFunctionsPage;
import com.paylocity.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class employeeFunctions_StepDefinitions {

EmployeeFunctionsPage employeeFunctionsPage = new EmployeeFunctionsPage();

    @When("Employer clicks on Add Employee button")
    public void employer_clicks_on_add_employee_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        EmployeeFunctionsPage.addEmployeeButton.click();
    }
    @Then("Employer should be able to enter First Name {string}")
    public void employer_should_be_able_to_enter_first_name(String string) {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    EmployeeFunctionsPage.enterFirstName.sendKeys(string);
    }

    @Then("Employer should be able to enter Last Name {string}")
    public void employer_should_be_able_to_enter_last_name(String string) {
    EmployeeFunctionsPage.enterLastName.sendKeys(string);
    }

    @Then("Employer should be able to enter Dependents {string}")
    public void employer_should_be_able_to_enter_dependents(String string) {
        EmployeeFunctionsPage.enterDependants.sendKeys(string);

    }
    @Then("Employer should be able to click Add button")
    public void employer_should_be_able_to_click_add_button() {
        EmployeeFunctionsPage.addButton.click();
    }
    @Then("Employer should see the employee in the table")
    public void employer_should_see_the_employee_in_the_table() {

        String actualEmployee = employeeFunctionsPage.employeeIsOnTheTable.getText();
        String expectedEmployee = "Steve";

        //Checking the context of the web element
        Assert.assertTrue(actualEmployee.equalsIgnoreCase(expectedEmployee));

        //Checking if the web element displayed or not
        Assert.assertTrue(employeeFunctionsPage.employeeIsOnTheTable.isDisplayed());

        String actualEmployee1 = EmployeeFunctionsPage.lastNameIsOnTheTable.getText();
        String expectedEmployee1= "Jobs";

        //Checking the context of the web element
        Assert.assertTrue(actualEmployee1.equalsIgnoreCase(expectedEmployee1));

        //Checking if the web element displayed or not
        Assert.assertTrue(EmployeeFunctionsPage.lastNameIsOnTheTable.isDisplayed());

    }
        @Then("the benefit cost calculations are correct")
        public void the_benefit_cost_calculations_are_correct () {
            String actualCalculation = EmployeeFunctionsPage.benefitsCost.getText();
            String expectedCalculation = "76.92";

            //Checking the context of the web element
            Assert.assertTrue(actualCalculation.equalsIgnoreCase(expectedCalculation));

            //Checking if the web element displayed or not
            Assert.assertTrue(EmployeeFunctionsPage.benefitsCost.isDisplayed());
        }


        }



