package com.paylocity.pages;

import com.paylocity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement userInput;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement mainHeader;
}
