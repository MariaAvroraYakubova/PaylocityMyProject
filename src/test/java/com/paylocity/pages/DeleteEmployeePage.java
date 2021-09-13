package com.paylocity.pages;

import com.paylocity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmployeePage {

    public DeleteEmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(xpath = "//i[@class='fas fa-times']")
        public static WebElement deleteActionButton;

    @FindBy(xpath = "//button[@id='deleteEmployee']")
    public static WebElement deleteButton;

    @FindBy(xpath = "//td[.='No employees found.']")
    public static WebElement messageDisplayed;
    //mainHeader
    //td[.='No employees found.']


}
