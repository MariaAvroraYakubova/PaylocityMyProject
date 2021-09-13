package com.paylocity.step_definitions;

import com.paylocity.pages.LoginPage;
import com.paylocity.utilities.ConfigurationReader;
import com.paylocity.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_StepDefinition {


    LoginPage loginPage = new LoginPage();


    @Given("Employer is on the login page")
    public void employer_is_on_the_login_page() {

        String url = ConfigurationReader.getProperty("webDriverUrl");

        Driver.getDriver().get(url);

    }


    @When("Employer input username")
    public void employer_input_username() {

        String userName = ConfigurationReader.getProperty("userName");
        loginPage.userInput.sendKeys(userName);

    }
    @When("Employer input password")
    public void employer_input_password() {
        String password = ConfigurationReader.getProperty("password");
        loginPage.passwordInput.sendKeys(password);

    }
    @When("Employer click login button")
    public void employer_click_login_button() {
        loginPage.loginButton.click();

    }
    @Then("Employer is on the Dashboard page")
    public void employer_is_on_the_dashboard_page() {

        String actualHeaderText = loginPage.mainHeader.getText();
        String expectedHeaderText= "Paylocity Benefits Dashboard";

        //Checking the context of the web element
        Assert.assertTrue(actualHeaderText.equalsIgnoreCase(expectedHeaderText));

        //Checking if the web element displayed or not
        Assert.assertTrue(loginPage.mainHeader.isDisplayed());
        }
    }


