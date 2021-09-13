package com.paylocity.pages;

import com.paylocity.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeFunctionsPage {

    public EmployeeFunctionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='add']")
    public static WebElement addEmployeeButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public static WebElement enterFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public static WebElement enterLastName;

    @FindBy(xpath = "//input[@id='dependants']")
    public static WebElement enterDependants;

    @FindBy(xpath = "//button[@id='addEmployee']")
    public static WebElement addButton;

    @FindBy(xpath = "//td[text()='Steve']")
    public static WebElement employeeIsOnTheTable;

    @FindBy(xpath = "//td[.='Jobs']")
    public static WebElement lastNameIsOnTheTable;

    @FindBy(xpath = "//td[.='76.92']")
    public static WebElement benefitsCost;



   // public DeleteEmployeePage() {
       // PageFactory.initElements(Driver.getDriver(), this);


    @FindBy(xpath = "//i[@class='fas fa-times']")
    public static WebElement deleteActionButton;

    @FindBy(xpath = "//button[@id='deleteEmployee']")
    public static WebElement deleteButton;

    @FindBy(xpath = "//td[.='No employees found.']")
    public static WebElement messageDisplayed;


   // public EditEmployeePage() {
      //  PageFactory.initElements(Driver.getDriver(), this);
   // }

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




}
