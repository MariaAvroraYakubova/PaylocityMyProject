package com.paylocity.pages;

import com.paylocity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployeePage {

    public EditEmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "(//i[@class='fas fa-edit'])[1]")
        public static WebElement editEmployeeButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public static WebElement editFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public static WebElement editLastName;

    @FindBy(xpath = "//input[@id='dependants']")
    public static WebElement editDependants;

    @FindBy(xpath = "//button[@id='updateEmployee']")
    public static WebElement updateEmployeeButton;

   // @FindBy(xpath = "//td[.='SteveMark']")
   // public static WebElement updatedEmployeeIsOnTheTable;

   // @FindBy(xpath = "//td[.='Steve']")
   // public static WebElement employeeIsOnTheTable;

  //  @FindBy(xpath = "//td[.='Steve']")
  //  public static WebElement employeeIsOnTheTable;

    }



